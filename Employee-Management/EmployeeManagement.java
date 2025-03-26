package EmpManegement;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

    
        Employee emp1 = new Employee(1, "Vishal S", 65000.0);
        Employee emp2 = new Employee(2, "Rahul M", 75000.0);
        Employee emp3 = new Employee(3, "Pankaj K", 60000.0);
        Employee emp4 = new Employee(3, "Raghav S", 60000.0);
        

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        employeeService.addEmployee(emp3);
        employeeService.addEmployee(emp4);

   
        System.out.println("\nInitial Employee List:");
        employeeService.displayAllEmployees();

        // Ask user if they want to add more employees
        System.out.print("\nDo you want to add more employees? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        while (choice.equals("yes")) {
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            Employee newEmployee = new Employee(id, name, salary);
            employeeService.addEmployee(newEmployee);
            System.out.println("Employee added successfully!");

            System.out.print("\nDo you want to add another employee? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        }

        // Display final employee list
        System.out.println("\nFinal Employee List:");
        employeeService.displayAllEmployees();

        scanner.close();
    }
}
