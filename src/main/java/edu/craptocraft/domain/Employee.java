package edu.craptocraft.domain;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, String department, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String firstName, String lastName, String email, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}

