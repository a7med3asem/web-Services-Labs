import com.generatedServices.employee.service.ConsumerService;
import com.generatedServices.employee.service.Employee;

public class Main {
    public static void main(String... arg) {
        ConsumerService consumerService = ConsumerService.getConsumerServiceInstance();

        Employee employee = new Employee();
        employee.setFirstName("Ahmed");
        employee.setLastName("Asim");

        consumerService.addEmployee(employee);

        // employee.setFirstName("Asim");
        // consumerService.updateEmployee(employee);

        // consumerService.deleteEmployee(22);
    }
}
