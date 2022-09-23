package com.server.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.models.Repositories.EmployeeRepository;
import com.server.models.entities.Employee;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findOne(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (!employee.isPresent()) {
            return null;
        } else {
            return employee.get();
        }
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void removeOne(Long nik) {
        employeeRepository.deleteById(nik);
    }
}
