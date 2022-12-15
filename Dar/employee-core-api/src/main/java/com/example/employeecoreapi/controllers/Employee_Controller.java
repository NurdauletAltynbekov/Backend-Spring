package com.example.employeecoreapi.controllers;

import com.example.employeecoreapi.models.Employee;
import com.example.employeecoreapi.services.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class Employee_Controller {
    @Autowired
    private Employee_Service employeeService;


    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeId(@PathVariable String employeeId){
        return employeeService.getEmployeeId(employeeId);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployeeId(@PathVariable String employeeId, @Valid @RequestBody Employee employee){
        employeeService.updateEmployeeId(employeeId, employee);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeId(@PathVariable String employeeId){
        employeeService.deleteEmployeeId(employeeId);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
    }
}

