package com.javacode.employeemanagementapp.service;

import com.javacode.employeemanagementapp.model.Employee;
import com.javacode.employeemanagementapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService{

     @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
