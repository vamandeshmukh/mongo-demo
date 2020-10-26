package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@RestController
public class EmployeeController {

	Employee emp = new Employee(101, "Vaman", 10.5);

	@GetMapping("/emp")
	public String emp() {
		System.out.println(emp.toString());
		return emp.toString();
	}

	@GetMapping("/empObj")
	public Employee empObj() {
		System.out.println(emp);
		return emp;
	}

	@GetMapping("/empJson")
	public String empJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String empJson = mapper.writeValueAsString(emp);
			return empJson;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(mapper);
		return null;
	}

	@GetMapping("/empGson")
	public String empGson() {
		Gson gson = new Gson();
		String empGson = gson.toJson(emp);
		System.out.println(empGson);
		return empGson;

	}

	@RequestMapping("/empList")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Vaman", 10.5));
		employeeList.add(new Employee(102, "Soman", 10.6));
		employeeList.add(new Employee(103, "Raman", 10.7));
		System.out.println(employeeList);
		return employeeList;
	}
}
