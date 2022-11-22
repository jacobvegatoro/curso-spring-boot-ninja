package com.it.backend.service;

import java.util.List;

import com.it.backend.entity.Course;

public interface CourseService {
	
	public List<Course> listAllCourses();
	public abstract Course addCourse(Course course);
	/*
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	*/

}
