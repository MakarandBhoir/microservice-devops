package com.synechron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.synechron.entities.Course;
import com.synechron.entities.Student;
import com.synechron.exceptions.StudentNotFoundException;
import com.synechron.feignproxy.CourseServiceProxy;
import com.synechron.service.StudentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
public class StudentRestController {
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseServiceProxy courseServiceProxy;
	
	private int count=0;
	
	// http://localhost:9094/students/101
	@GetMapping("/students/{studentId}")
	@CircuitBreaker(name = "courseServiceCircuitBreaker", fallbackMethod = "dummyCourseData")
	@RateLimiter(name="courseServiceRateLimiter", fallbackMethod = "ratelimiterfallback")
	public Student getStudentById(@PathVariable("studentId") Integer studentId) throws StudentNotFoundException {
		Student student = studentService.findStudentById(studentId);
		System.out.println("---- calling course service = "+ ++count +" ----");
		List<Course> courses = courseServiceProxy.getCoursesByStudentId(studentId);
		student.setCourse(courses);
		
		return student;
	}
	public Student ratelimiterfallback(@PathVariable("studentId") Integer studentId, Exception e) {
		return null;
	}
	
	public Student dummyCourseData(@PathVariable("studentId") Integer studentId, Exception e) throws StudentNotFoundException {
		Student student = studentService.findStudentById(studentId);
		
		student.setCourse(null);
		
		return student;
	}
}










