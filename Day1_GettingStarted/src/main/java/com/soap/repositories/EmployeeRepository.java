package com.soap.repositories;

import com.soap.entity.Employee;

public interface EmployeeRepository {
    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployee(int id);
}
