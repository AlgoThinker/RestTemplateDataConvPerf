package com.optimisation.CalleeMicroservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.optimisation.CalleeMicroservice.entity.Employee;
import com.optimisation.CalleeMicroservice.service.EmployeeService;
import com.optimisation.CalleeMicroservice.shared.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<EmployeeDto> getAllEmployees() {

		List<EmployeeDto> employeesDto = new ArrayList<>();

		List<Employee> employees = getDataFromMockDataRepository();

		for (Object source : employees) {
			EmployeeDto target = new EmployeeDto();
			BeanUtils.copyProperties(source, target);
			employeesDto.add(target);
		}

		return employeesDto;
	}

	public List<Employee> getDataFromMockDataRepository() {
		List<Employee> employees = new ArrayList<>();

		Employee employee1 = new Employee("100", "John", "Wick", "Actor");
		Employee employee2 = new Employee("200", "Brad", "Pitt", "Director");
		Employee employee3 = new Employee("300", "Daniel", "Craid", "Producer");
		Employee employee4 = new Employee("400", "Jay", "Zee", "Singer");
		Employee employee5 = new Employee("500", "Enrique", "Iglesia", "Technician");

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		return employees;
	}

}
