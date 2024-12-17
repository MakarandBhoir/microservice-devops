package com.synechron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.synechron.dao.StudentDao;
import com.synechron.entities.Student;
import com.synechron.exceptions.StudentNotFoundException;
@Service
@Scope(scopeName="singleton")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> findAllStudents() {
		return studentDao.readAllStudents();
	}

	@Override
	public Student findStudentById(Integer studentId) throws StudentNotFoundException {
		return studentDao.readStudentById(studentId);
	}

}






