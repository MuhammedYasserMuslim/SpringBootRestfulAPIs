package com.spring.services;

import com.spring.model.Employee;
import com.spring.repository.EmployeeRepository;
import com.spring.services.ServicesInterfaces.EmployeeServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices implements EmployeeServicesInterface {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Long getCount() {
        return employeeRepository.count();
    }

    @Override
    public List<Employee> getEmployeeByAge(int age) {
        return employeeRepository.findByAge(age);
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
