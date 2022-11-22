package com.it.backend.converter;

import org.springframework.stereotype.Component;

import com.it.backend.entity.Course;
import com.it.backend.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	
	//Entity -->Model
	public CourseModel entity2model(Course course) {
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		return courseModel;
	}
	//Model --> Entity
	public Course entity2model (CourseModel courseModel) {
		Course course=new Course();
		course.setName(course.getName());
		course.setDescription(course.getDescription());
		course.setPrice(course.getPrice());
		course.setHours(course.getHours());
		return course;
	}
}
