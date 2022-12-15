package com.example.employeecoreapi.services;

import com.example.employeecoreapi.models.Employee;

import java.util.List;

public interface Employee_Service {
    void createEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeId(String id);
    void updateEmployeeId(String id, Employee employee);
    void deleteEmployeeId(String id);

}
