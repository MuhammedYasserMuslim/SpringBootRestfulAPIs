package com.spring.services.ServicesInterfaces;

import com.spring.model.Department;
import com.spring.model.Employee;
import com.spring.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeServicesInterface {


    public Long getCount();

    public List<Employee> getAllEmployee();

    public Optional<Employee> getEmployeeById(Long id);

    public List<Employee> getEmployeeByName(String name);

    public List<Employee> getEmployeeByAge(int age);

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployeeById(Long id);
    public List<Employee> getByDepartmentId(Long id);


}
