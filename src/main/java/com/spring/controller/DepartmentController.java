package com.spring.controller;

import com.spring.model.Department;
import com.spring.services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dep")
//http://localhost:8080/emp
public class DepartmentController {

    @Autowired
    DepartmentServices departmentServices;

    @GetMapping("/count")
    //http://localhost:8080/dep/count
    public void getCount() {
        departmentServices.getCount();

    }

    @GetMapping("/departments")
    //http://localhost:8080/dep/departments
    public List<Department> getAllDepartment() {
        return departmentServices.getAllDepartment();
    }

    @GetMapping("/department")
    //http://localhost:8080/dep/department?id=
    public Optional<Department> getDepartmentById(@RequestParam Long id) {
        return departmentServices.getDepartmentById(id);
    }

    @GetMapping("/departmente")
    //http://localhost:8080/dep/departmente?name=
    public List<Department> getDepartmentByName(@RequestParam String name) {
        return departmentServices.getDepartmentByName(name);
    }

    @PostMapping("/department")
    //http://localhost:8080/dep/department
    public void addDepartment(@RequestBody Department department) {
        departmentServices.addDepartment(department);
    }

    @PutMapping("/department")
    //http://localhost:8080/dep/department
    public void updateDepartment(@RequestBody Department department) {
        departmentServices.updateDepartment(department);
    }

    @DeleteMapping("/department")
    //http://localhost:8080/dep/department?id=
    public void deleteDepartmentById(@RequestParam Long id) {
        departmentServices.deleteDepartmentById(id);
    }



}
