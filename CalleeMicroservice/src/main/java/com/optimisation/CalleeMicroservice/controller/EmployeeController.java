package com.optimisation.CalleeMicroservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimisation.CalleeMicroservice.model.EmployeeResponse;
import com.optimisation.CalleeMicroservice.service.EmployeeService;
import com.optimisation.CalleeMicroservice.shared.dto.EmployeeDto;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/all-employees")
	public List<EmployeeResponse> getAllEmployees() {

		List<EmployeeDto> allEmployeesDto = employeeService.getAllEmployees();

		List<EmployeeResponse> allEmployeesResponse = new ArrayList<>();

		for (Object source : allEmployeesDto) {
			EmployeeResponse target = new EmployeeResponse();
			BeanUtils.copyProperties(source, target);
			allEmployeesResponse.add(target);
		}
		
		return allEmployeesResponse;
	}

}
