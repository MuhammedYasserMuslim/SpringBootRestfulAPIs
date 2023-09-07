package com.spring.controller;

import com.spring.model.Employee;
import com.spring.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
//http://localhost:8080/emp
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;


    @GetMapping("/count")
    //http://localhost:8080/emp/count
    public Long getCount() {
        return employeeServices.getCount();
    }

    @GetMapping("/employees")
    //http://localhost:8080/emp/employees
    public List<Employee> getAllEmployee() {
        return employeeServices.getAllEmployee();
    }

    @GetMapping("/employee")
    //http://localhost:8080/emp/employee?id=
    public Optional<Employee> getEmployeeById(@RequestParam Long id) {
        return employeeServices.getEmployeeById(id);
    }

    @GetMapping("/emplo")
    //http://localhost:8080/emp/emplo?id=
    public List<Employee> getEmployeeByDepartment(@RequestParam Long id) {
        return employeeServices.getByDepartmentId(id);
    }

    @GetMapping("/employeee")
    //http://localhost:8080/emp/employeee?name=
    public List<Employee> getEmployeeByName(@RequestParam String name) {
        return employeeServices.getEmployeeByName(name);
    }

    @GetMapping("/employeeee")
    //http://localhost:8080/emp/employeeee?age=
    public List<Employee> getEmployeeByAge(@RequestParam int age) {
        return employeeServices.getEmployeeByAge(age);
    }

    @PostMapping("/employees")
    //http://localhost:8080/emp/employees
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeServices.addEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    //http://localhost:8080/emp/employees
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeServices.updateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees")
    //http://localhost:8080/emp/employees?id=
    public void deleteEmployeeById(@RequestParam Long id) {
        employeeServices.deleteEmployeeById(id);
    }


}
