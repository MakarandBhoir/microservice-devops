package com.synechron.service;

import java.util.List;

import com.synechron.entities.Course;

public interface CourseService {
	public List<Course> findCoursesByStudentId(int studentId);
}
