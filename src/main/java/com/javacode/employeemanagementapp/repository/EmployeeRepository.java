package com.javacode.employeemanagementapp.repository;

import com.javacode.employeemanagementapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
