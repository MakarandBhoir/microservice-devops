package com.synechron.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.synechron.entities.Course;
import com.synechron.entities.Student;
import com.synechron.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private StudentService studentService;
	
	// http://localhost:9095/students/101
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable("studentId") Integer studentId) {
		Student student = studentService.findStudentById(studentId);

//		List<Course> courses = template.getForObject("http://localhost:9004/courses/student/" + studentId, List.class);
//		student.setCourse(courses);
		
		// Get the list of service instances
		List<ServiceInstance> instances = discoveryClient.getInstances("COURSE-MICROSERVICE");
		// Genarate a random number between 0 and instances.size()
		int random = new Random().nextInt(instances.size());
		// Get the random service instance
		ServiceInstance instance = instances.get(random);
		// Get the URI
		String uri = instance.getUri().toString();
		uri = uri + "/courses/student/" + studentId;
		List<Course> courses = template.getForObject(uri, List.class);
		student.setCourse(courses);
		
		
		return student;
	}
}










