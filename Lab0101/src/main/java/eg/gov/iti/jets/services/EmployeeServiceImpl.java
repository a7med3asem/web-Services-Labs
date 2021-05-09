package eg.gov.iti.jets.services;

import eg.gov.iti.jets.entity.Employee;

import jakarta.jws.WebService;

@WebService(endpointInterface = "eg.gov.iti.jets.services.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public boolean addEmployee(Employee employee) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.addEmployee(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.updateEmployee(employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(int id) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        employeeRepositoryImpl.deleteEmployee(id);
        return true;
    }

    @Override
    public Employee getEmployee(int id) {
        EmployeeRepository employeeRepositoryImpl = new EmployeeRepositoryImpl();
        Employee employee = employeeRepositoryImpl.getEmployee(id);

        return employee;
    }
}
