package com.spring.repository;

import com.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByName(String name);

    List<Employee>findByAge(int age);


}
