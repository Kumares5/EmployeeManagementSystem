package com.Assignment.EmployeeManagementSystem.repository;

import com.Assignment.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByEmail(String email);

}
