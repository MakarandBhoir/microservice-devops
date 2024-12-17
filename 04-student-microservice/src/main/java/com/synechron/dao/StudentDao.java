package com.synechron.dao;

import java.util.List;

import com.synechron.entities.Course;
import com.synechron.entities.Student;
import com.synechron.exceptions.DuplicateStudentException;
import com.synechron.exceptions.StudentNotFoundException;

public interface StudentDao {
	public int createStudent(Student student)throws DuplicateStudentException;
	public List<Student> readAllStudents();
	public int updateStudent(Student student);
	public int deleteStudent(int studentId)throws StudentNotFoundException;
	public Student readStudentById(int studentId)throws StudentNotFoundException;
	public List<Student> readStudentByMinAndMaxScore(double min, double max);
	public List<Course> readCoursesByStudentId(int studentId)throws StudentNotFoundException;
}
