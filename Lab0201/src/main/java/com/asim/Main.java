package com.asim;

import com.asim.services.*;
import com.asim.services.employeeservice.*;

public class Main {
    public static void main(String... arg) {
        ConsumerService consumerService = ConsumerService.getConsumerServiceInstance();

        Employee employee = new Employee();
        employee.setFirstName("Ahmed");
        employee.setLastName("Galal");

        consumerService.addEmployee(employee);

        // employee.setFirstName("Asim");
        // consumerService.updateEmployee(employee);

        // consumerService.deleteEmployee(22);
    }
}