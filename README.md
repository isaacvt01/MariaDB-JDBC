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

Configuration

This class assumes that the database is running on the default MariaDB port of 3306, and that the database name is "employees". If your database is running on a different port or has a different name, you can modify the DB_URL, USER, and PASS constants accordingly.
