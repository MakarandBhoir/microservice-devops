package com.synechron.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.synechron.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	private List<Course> dummyDatabase = new ArrayList<>();
	
	public CourseServiceImpl() {
		dummyDatabase.add(new Course(1, "Java", 20000, 1));
		dummyDatabase.add(new Course(2, "DevOps", 30000, 1));
		dummyDatabase.add(new Course(3, "Python", 20000, 2));
		dummyDatabase.add(new Course(4, "Angular", 15000, 3));
	}
	@Override
	public List<Course> findCoursesByStudentId(int studentId) {
		return dummyDatabase.stream().filter(c -> c.getStudentId() == studentId).collect(Collectors.toList());
	}
}
