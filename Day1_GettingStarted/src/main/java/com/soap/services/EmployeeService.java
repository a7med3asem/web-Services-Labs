package com.soap.services;

import com.soap.entity.Employee;
// import eg.gov.iti.jets.repositories.*;

import jakarta.jws.WebService;

@WebService
public interface EmployeeService {
    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int id);

    Employee getEmployee(int id);
}
