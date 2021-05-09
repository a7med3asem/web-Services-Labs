package eg.gov.iti.jets.services;

import eg.gov.iti.jets.entity.Employee;

import jakarta.jws.WebService;
// import jakarta.jws.Method;

@WebService
public interface EmployeeService {
    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int id);

    Employee getEmployee(int id);
}
