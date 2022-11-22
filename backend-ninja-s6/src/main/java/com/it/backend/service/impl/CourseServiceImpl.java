package com.it.backend.service.impl;

import java.util.List;

//import org.apache.juli.logging.Log;
//import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.it.backend.entity.Course;
import com.it.backend.repository.CourseJpaRepository;
import com.it.backend.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

	//private static final Log LOG= LogFactory.getLog(CourseServiceImpl.class);
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public List<Course> listAllCourses() {
		//LOG.info("Call Repository listAllCourses()");
		return courseJpaRepository.findAll();
		
	}
	
	@Override
	public Course addCourse(Course course) {
		//LOG.info("Call Repository addCourse()");
		return courseJpaRepository.save(course);
	}

	/*
	@Override
	public int removeCourse(int id) {
		LOG.info("Call Repository remove() by id");
		courseJpaRepository.deleteById(id);
		
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		LOG.info("Call Repository updateCourse()");
		return courseJpaRepository.save(course);
	}
	*/

}
