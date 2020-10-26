package com.example.demo.emp;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	public List<Employee> findByName(String name);

}
