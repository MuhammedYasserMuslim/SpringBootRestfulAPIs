package com.spring.repository;

import com.spring.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Objects;

@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List <Department> findByName(String name);





}
