package com.spring.services.ServicesInterfaces;

import com.spring.model.Department;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface DepartmentServicesInterface {
    public Long getCount();

    public List<Department> getAllDepartment();

    public Optional<Department> getDepartmentById(Long id);

    public List<Department> getDepartmentByName(String name);


    public void addDepartment(Department department);

    public void updateDepartment(Department department);

    public void deleteDepartmentById(Long id);







}
