package com.javacode.employeemanagementapp.service;

import com.javacode.employeemanagementapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveNewEmployee(Employee employee);
}
