package com.example.employeecoreapi.services;

import com.example.employeecoreapi.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements Employee_Service{
    private static final HashMap<String, Employee> employeeMap = new HashMap<>();

    static {
        Employee employee1 = new Employee(UUID.randomUUID().toString(),"Nurlan","Abdulyn","Dar",
                "Back-end","nrdlt_51@gmail.com",170.000);
        Employee employee2 = new Employee(UUID.randomUUID().toString(),"Nursultan","Eraly","Bank",
                "Back-end","nrdlt_52@gmail.com",180.000);
        Employee employee3 = new Employee(UUID.randomUUID().toString(),"Nurgalym","Galym","Kaspi",
                "Back-end","nrdlt_53@gmail.com",190.000);

        employeeMap.put(employee1.getEmployee_id().toString(), employee1);
        employeeMap.put(employee2.getEmployee_id().toString(), employee2);
        employeeMap.put(employee3.getEmployee_id().toString(), employee3);
    }

    @Override
    public void createEmployee(Employee employee) {
        employee.setEmployee_id(UUID.randomUUID().toString());
        employeeMap.put(employee.getEmployee_id().toString(), employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee getEmployeeId(String id) {
        return employeeMap.get(id);
    }

    @Override
    public void updateEmployeeId(String id, Employee employee) {
        employee.setEmployee_id(id);
        employeeMap.put(id, employee);
    }

    @Override
    public void deleteEmployeeId(String id) {
        employeeMap.remove(id);
    }
}

