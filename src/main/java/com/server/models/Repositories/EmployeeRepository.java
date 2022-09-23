package com.server.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.server.models.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    
}
