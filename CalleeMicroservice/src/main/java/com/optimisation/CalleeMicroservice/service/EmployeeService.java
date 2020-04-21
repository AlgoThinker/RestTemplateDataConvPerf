package com.optimisation.CalleeMicroservice.service;

import java.util.List;

import com.optimisation.CalleeMicroservice.shared.dto.EmployeeDto;

public interface EmployeeService {
	
	List<EmployeeDto> getAllEmployees();

}
