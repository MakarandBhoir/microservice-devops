package com.synechron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.entities.Student;
import com.synechron.service.StudentService;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	// http://localhost:9095/students/101
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable("studentId") Integer studentId) {
		Student student = studentService.findStudentById(studentId);
		
		return student;
	}
}










