package com.javacode.employeemanagementapp.service;

import com.javacode.employeemanagementapp.model.Employee;
import com.javacode.employeemanagementapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService{

   @Autowired
   private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveNewEmployee(Employee employee) {
            employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {

    Optional<Employee> optional = employeeRepository.findById(id);
    Employee employee = null;

    if(optional.isPresent()){
        employee = optional.get();
    }else{
        throw new RuntimeException("Employee not found for id: " + id);
    }
    return employee;

    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

}
