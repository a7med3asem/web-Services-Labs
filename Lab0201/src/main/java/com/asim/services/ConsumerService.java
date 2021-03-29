package com.asim.services;

import com.asim.services.employeeservice.*;

public class ConsumerService {
    private static ConsumerService consumerService;
    private EmployeeService employeeService;

    public static ConsumerService getConsumerServiceInstance() {
        if (consumerService == null) {
            consumerService = new ConsumerService();
        }
        return consumerService;
    }

    public ConsumerService() {
        EmployeeServiceImplService employeeServiceImplService = new EmployeeServiceImplService();
        employeeService = employeeServiceImplService.getEmployeeServiceImplPort();
    }

    public boolean addEmployee(Employee employee) {
        try {
            employeeService.addEmployee(employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
        return true;
    }

    public boolean deleteEmployee(int id) {
        employeeService.deleteEmployee(id);

        return true;
    }

    public Employee getEmployee(int id) {
        return employeeService.getEmployee(id);
    }
}
