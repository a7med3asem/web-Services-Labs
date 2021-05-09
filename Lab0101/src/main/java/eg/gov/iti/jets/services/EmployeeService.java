package eg.gov.iti.jets.services;

import eg.gov.iti.jets.entity.Employee;
// import eg.gov.iti.jets.repositories.*;

import jakarta.jws.WebService;

@WebService
public interface EmployeeService {
    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int id);

    Employee getEmployee(int id);
}
