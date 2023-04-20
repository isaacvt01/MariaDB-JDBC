package edu.craptocraft.dao;

import edu.craptocraft.domain.Employee;
import edu.craptocraft.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Add employee
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (first_name, last_name, email, department, salary) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getDepartment());
            preparedStatement.setFloat(5, employee.getSalary());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update employee
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employees SET first_name = ?, last_name = ?, email = ?, department = ?, salary = ? WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getDepartment());
            preparedStatement.setFloat(5, employee.getSalary());
            preparedStatement.setInt(6, employee.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete employee
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setDepartment(resultSet.getString("department"));
                employee.setSalary(resultSet.getFloat("salary"));

                employees.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        Employee employee = null;
        String sql = "SELECT * FROM employees WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    employee = new Employee();
                    employee.setId(resultSet.getInt("id"));
                    employee.setFirstName(resultSet.getString("first_name"));
                    employee.setLastName(resultSet.getString("last_name"));
                    employee.setEmail(resultSet.getString("email"));
                    employee.setDepartment(resultSet.getString("department"));
                    employee.setSalary(resultSet.getFloat("salary"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }
}


