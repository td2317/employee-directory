package com.example.employeedirectory.repository;

import com.example.employeedirectory.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom method for searching by name (case-insensitive)
    List<Employee> findByNameContainingIgnoreCase(String name);
}