package com.example.demo.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private final EmployeeRepository repository;

	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
		this.repository.deleteAll();
		this.repository.save(new Employee("Sonu", 10.5));
		this.repository.save(new Employee("Monu", 10.6));
		this.repository.save(new Employee("Ponu", 10.7));
		this.repository.save(new Employee("Tonu", 10.8));
		this.repository.save(new Employee("Bonu", 10.9));
	}

	@GetMapping("hi")
	public String hi() {
		System.out.println("Hi!");
		return "Hi!";
	}

	@GetMapping("/empList")
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}

	@GetMapping("/empByName/{name}")
	public List<Employee> getEmpByName(@PathVariable String name) {
		return repository.findByName(name);
	}
}
