package com.example.employeedirectory.service;

import com.example.employeedirectory.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Page<Employee> getAllEmployees(Pageable pageable);
    List<Employee> searchEmployeesByName(String name);
}
