package com.optimisation.CallerMicroservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimisation.CallerMicroservice.entity.Person;
import com.optimisation.CallerMicroservice.model.PersonResponse;
import com.optimisation.CallerMicroservice.service.PersonService;

@RestController
@RequestMapping("persons")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping(path="/all-persons")
	public List<Person> getAllPersons(){         // ToDo : Change List type to PersonResponse
		
		return personService.getAllPersons();
		
		
	}
}
