package com.synechron.feignproxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.synechron.model.Course;

//@FeignClient(name = "COURSE-MICROSERVICE", path = "/courses")
@FeignClient(name = "course-microservice", path = "/courses")
public interface CourseServiceProxy {
	@GetMapping(path="student/{stuId}")
	
	// http://course-microservice/courses/student/1
	public List<Course> getCoursesByStudentId(@PathVariable("stuId") int studentId);
}
