# MariaDB-JDBC

This is the JDBC project.

It's a CRUD for a table called employees.

# Employee DAO


This is a Java class that handles database operations related to employees. The database is accessed through a JDBC connection.
## Functionality

The EmployeeDAO class provides the following functionality:

    Add employee: Inserts a new employee record into the database with the provided information.
    Update employee: Updates an existing employee record in the database with the provided information.
    Delete employee: Removes an existing employee record from the database with the provided ID.
    Get all employees: Retrieves a list of all employee records from the database.
    Get employee by ID: Retrieves a single employee record from the database with the provided ID.

## Methods

The EmployeeDAO class provides the following methods:


addEmployee(Employee employee)
This method adds a new employee record to the database with the provided employee object.

updateEmployee(Employee employee)
This method updates an existing employee record in the database with the provided employee object.

deleteEmployee(int id)
This method deletes an existing employee record from the database with the provided ID.

getAllEmployees()
This method retrieves a list of all employee records from the database.

getEmployeeById(int id)
This method retrieves a single employee record from the database with the provided ID.

# DBConnection Class
The DBConnection class is responsible for creating and managing a connection to a MariaDB database.

## Usage

To use this class, simply call the getConnection() method, which will return a Connection object that can be used to execute SQL queries.

## Configuration

This class assumes that the database is running on the default MariaDB port of 3306, and that the database name is "employees". 
If your database is running on a different port or has a different name, you can modify the DB_URL, USER, and PASS constants accordingly.

# Employee Class

The Employee class is a simple Java class that represents an employee. It contains the following properties:

    id: an integer that represents the employee's unique ID.
    firstName: a string that represents the employee's first name.
    lastName: a string that represents the employee's last name.
    email: a string that represents the employee's email address.
    department: a string that represents the employee's department.
    salary: a float that represents the employee's salary.

## Constructors

The Employee class has the following constructors:

    Employee(): a no-argument constructor.
    Employee(int id, String firstName, String lastName, String email, String department, int salary): a constructor that takes in all the properties as arguments.
    Employee(String firstName, String lastName, String email, String department, int salary): a constructor that takes in all the properties except id as arguments.

## Getters and Setters

The Employee class has getters and setters for all its properties.
Overridden Methods

The Employee class overrides the toString() method to provide a string representation of the Employee object.
