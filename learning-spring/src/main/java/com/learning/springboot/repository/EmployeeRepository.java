package com.learning.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.learning.springboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
    List<Employee> findAll();

}
