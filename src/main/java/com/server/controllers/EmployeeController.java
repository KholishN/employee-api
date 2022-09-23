package com.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.models.entities.Employee;
import com.server.services.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public Iterable<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Employee findOne(@PathVariable("id") Long id) {
        return employeeService.findOne(id);
    }

    @PatchMapping("{id}")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("{id}")
    public void removeOne(@PathVariable("id") Long nik) {
        employeeService.removeOne(nik);

    }
}
