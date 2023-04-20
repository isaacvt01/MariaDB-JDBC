package edu.craptocraft;

import edu.craptocraft.dao.EmployeeDAO;
import edu.craptocraft.domain.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeDAO employeeDAO = new EmployeeDAO();

// Add employee
        Employee newEmployee = new Employee("John", "Doe", "john.doe@example.com", "IT", 75000);
        employeeDAO.addEmployee(newEmployee);

// Get all employees
        List<Employee> employees = employeeDAO.getAllEmployees();
        for (Employee employee : employees) {
                System.out.println(employee);
            }
        // Update employee
        Employee employeeToUpdate = new Employee(2, "John", "Doe", "john.doe@example.com", "HR", 80000);
        employeeDAO.updateEmployee(employeeToUpdate);

// Get employee by ID
        Employee employee = employeeDAO.getEmployeeById(3);
        System.out.println("Employee with ID 1: " + employee);

// Delete employee
        employeeDAO.deleteEmployee(2);

// Get all employees after deletion
        employees = employeeDAO.getAllEmployees();
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
    }
}
