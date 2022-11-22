package com.it.backend.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.it.backend.component.ExampleComponent;
import com.it.backend.model.Person;
import com.it.backend.service.ExampleService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/example2")
public class ExampleV2Controller {
	
	public static final String EXAMPLE_VIEW="example";
	
	
	//Inyecta servicio en controller con Autowired
	@Autowired
	//llamar a servicio exampleServiceImpl
	@Qualifier("exampleService")
	
	//se declara interfase 
	private ExampleService exampleService;
	
	@Qualifier("ExampleComponent")
	private ExampleComponent exampleComponent;
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	/*Utilizando ModelAndView*/
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav= new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", exampleService.getListPeople());
		return mav;
	}

	private List<Person> getPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Jon", 409));
		people.add(new Person("Santiago", 1));
		people.add(new Person("Carlitos", 34));
		people.add(new Person("Pia", 70));
		people.add(new Person("Ignacio", 2));
		return people;
	}
}

/* capítulo 18
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

/*
 *
 //capítulo 19
  	public static final String EXAMPLE_VIEW="example";
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("name", "Carlitos");
		return EXAMPLE_VIEW;
	}
	//Utilizando ModelAndView
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav= new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("name","Santi");
		return mav;
	}
 * */

/* capítulo 20
public static final String EXAMPLE_VIEW="example";
@GetMapping("/exampleString")
public String exampleString(Model model) {
	model.addAttribute("person", new Person("Elon",30));
	return EXAMPLE_VIEW;
}
//Utilizando ModelAndView
@GetMapping("/exampleMAV")
public ModelAndView exampleMAV() {
	ModelAndView mav= new ModelAndView(EXAMPLE_VIEW);
	mav.addObject(new Person("ElonMAV",340));
	return mav;
}

private List<Person> getPeople() {
	List<Person> people = new ArrayList<>();
	people.add(new Person("Jon", 409));
	people.add(new Person("Santiago", 1));
	people.add(new Person("Carlitos", 34));
	people.add(new Person("Pia", 70));
	people.add(new Person("Ignacio", 2));
	return people;
}
*/
 