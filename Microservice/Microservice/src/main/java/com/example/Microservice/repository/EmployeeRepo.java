package com.example.Microservice.repository;
import com.example.Microservice.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}