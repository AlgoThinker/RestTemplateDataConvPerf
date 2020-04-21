package com.optimisation.CallerMicroservice.service;

import java.util.List;
import com.optimisation.CallerMicroservice.dto.PersonDto;
import com.optimisation.CallerMicroservice.entity.Person;

public interface PersonService {

	public List<Person> getAllPersons();   // ToDo : Change List type to PersonDto 
	
}
