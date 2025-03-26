package EmpManegement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    // Constructor to initialize the employee list
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully: " + employee.getName());
    }

    // Method to display all employees
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

    // Method to find an employee by ID
    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null; // Return null if not found
    }

    // Method to remove an employee by ID
    public boolean removeEmployee(int id) {
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee removed successfully: " + emp.getName());
            return true;
        } else {
            System.out.println("Employee with ID " + id + " not found.");
            return false;
        }
    }
}
