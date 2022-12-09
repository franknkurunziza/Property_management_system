package com.example.Executive.service;

import com.example.Executive.model.Employee;
import com.example.Executive.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
}
