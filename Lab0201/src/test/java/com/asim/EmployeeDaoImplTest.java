package com.asim;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.asim.services.*;
import com.asim.services.employeeservice.*;

// @TestInstance(Lifecycle.PER_CLASS)
public class EmployeeDaoImplTest {
    private static ConsumerService consumerService;

    @BeforeAll
    static void initAll() {
        consumerService = ConsumerService.getConsumerServiceInstance();
        System.out.println("before all");
    }

    @BeforeEach
    void init() {
        System.out.println("before each");

    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }

    @Test
    public void testAddEmployee() {
        System.out.println("test case add employee");
        Employee employee = new Employee();
        employee.setFirstName("Ahmed");
        employee.setLastName("Asim");
        try {
            assertTrue(consumerService.addEmployee(employee), "Cannot add emp!!");
        } catch (Exception e) {
            fail("Cannot add emp!!");
        }
    }

    @Test
    public void testUpdateEmployee() {
        System.out.println("test case update employee");
        Employee employee = new Employee();
        employee.setId(15);
        employee.setFirstName("Aboelsayed");
        employee.setLastName("Asim");
        try {
            assertTrue(consumerService.updateEmployee(employee), "Cannot update emp!!");
        } catch (Exception e) {
            fail("Cannot update emp!!");
        }
    }

    @Test
    @Disabled
    public void testDeleteEmployee() {
        System.out.println("test case delete employee");

        try {
            assertTrue(consumerService.deleteEmployee(23), "Cannot delete emp!!");
        } catch (Exception e) {
            fail("Cannot delete emp!!");
        }
    }

    @Test
    @Disabled
    public void testGetEmployee() {
        System.out.println("test case get employee");
        try {
            assertNotNull(consumerService.getEmployee(10), "Cannot get emp!!");
        } catch (Exception e) {
            fail("Cannot get emp!!");
        }
    }
}
