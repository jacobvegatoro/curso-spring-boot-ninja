package com.it.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.it.backend.model.Person;
import com.it.backend.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG= LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getListPeople(){
			List<Person> people = new ArrayList<>();
			people.add(new Person("Jon", 409));
			people.add(new Person("Santiago", 1));
			people.add(new Person("Carlitos", 34));
			people.add(new Person("Pia", 70));
			people.add(new Person("Ignacio", 2));
			LOG.info("Log From Services");
			return people;
	}
}
