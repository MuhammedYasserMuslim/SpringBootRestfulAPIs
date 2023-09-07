package com.spring.services;

import com.spring.model.Department;
import com.spring.repository.DepartmentRepository;
import com.spring.services.ServicesInterfaces.DepartmentServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServices implements DepartmentServicesInterface {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Long getCount() {
        return departmentRepository.count();
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> getDepartmentByName(String name) {
        return departmentRepository.findByName(name);
    }


    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

}
