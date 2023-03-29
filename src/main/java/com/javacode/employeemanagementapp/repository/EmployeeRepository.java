package com.javacode.employeemanagementapp.repository;

import com.javacode.employeemanagementapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
