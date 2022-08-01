package com.example.demo.respository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="emp")
//@RepositoryRestController(path ="emp")
@CrossOrigin("http://localhost:4200/")
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
