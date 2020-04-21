package com.optimisation.CallerMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {

	@NonNull
	String id;
	String name;
	EmployeeDetail employeeDetail;
	String age;
}
