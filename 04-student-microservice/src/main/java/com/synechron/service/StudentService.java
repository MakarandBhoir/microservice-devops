package com.synechron.service;

import java.util.List;

import com.synechron.exceptions.DuplicateStudentException;
import com.synechron.exceptions.StudentNotFoundException;
import com.synechron.model.Course;
import com.synechron.model.Student;

public interface StudentService {
	public List<Student> findAllStudents();
	public boolean addStudent(Student student)throws DuplicateStudentException;
	public boolean modifyStudent(Student student);
	public boolean removeStudent(int studentId)throws StudentNotFoundException;
	public Student findStudentById(int studentId)throws StudentNotFoundException;
	public List<Course> findCoursesByStudentId(int studentId)throws StudentNotFoundException;
}
