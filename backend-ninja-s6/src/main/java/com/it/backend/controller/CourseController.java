package com.it.backend.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.backend.entity.Course;
import com.it.backend.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

	
	private static final String COURSES_VIEW="courses";
	private static final Log LOG= LogFactory.getLog(CourseController.class);
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService;
	
	@GetMapping("/tabla")
	public ModelAndView verTabla() {	
		ModelAndView mav= new ModelAndView("tabla");
		return mav;
	}
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses() {	
		LOG.info("Call List All Courses");
		ModelAndView mav= new ModelAndView(COURSES_VIEW);
		mav.addObject("course", new Course());
		mav.addObject("courses",courseService.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("course") Course course ) {
		LOG.info("Call ADD Courses - Details" + course.toString());
		courseService.addCourse(course);
		return "redirect:/courses/listcourses";
	}
}
