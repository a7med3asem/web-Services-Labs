package com.soap.services;

import com.soap.entity.Employee;

import jakarta.jws.*;

@WebService
public interface EmployeeService {

    boolean addEmployee(Employee employee);

    @WebMethod(operationName = "UpdateMethod")
    boolean updateEmployee(Employee employee);

//    @WebMethod(exclude = true)
    @WebMethod
    boolean deleteEmployee(int id);

    @WebResult(header = true, name = "Retrieve result")
    Employee getEmployee(int id);
}
