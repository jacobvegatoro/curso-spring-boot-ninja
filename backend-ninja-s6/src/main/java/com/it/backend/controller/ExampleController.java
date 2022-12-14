package com.it.backend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW="example";
	@GetMapping("/exampleString")
	public String exampleString() {
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		return new ModelAndView(EXAMPLE_VIEW);
	}
}

/*
public static final String EXAMPLE_VIEW="example";
	@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	public String exampleString() {
		return "EXAMPLE_VIEW";
	}
	
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		return new ModelAndView("exampleMAV");
	}
 * */
 