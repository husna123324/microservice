package com.example.simple.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simple.microservices.project.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}