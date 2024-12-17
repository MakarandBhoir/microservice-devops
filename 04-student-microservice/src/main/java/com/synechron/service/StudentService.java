package com.synechron.service;

import java.util.List;

import com.synechron.entities.Student;
import com.synechron.exceptions.StudentNotFoundException;

public interface StudentService {
	public List<Student> findAllStudents();
	public Student findStudentById(Integer studentId)throws StudentNotFoundException;
}
