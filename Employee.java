/*
Create a Java program to represent employees in a company.
1-Define a base class Employee with attributes name(String), age(int), and salary(double).
2-Create subclasses Manager, Engineer, and Salesperson.
  Each subclass should have specific attributes and methods related to their roles.
3-Manager should have a department attribute (string),
4-an Engineer should have a project attribute (string), and a
5-Salesperson should have a salesTarget attribute(double).
6-Override the Equals method only in parent class to compare employees based on salary
7-Override the toString method in each class to display all details about 
  the employee. (you should call the method of the parent class 
  and then print the extra data members of the children)
8-In the main let the user enter the number of employees and their types
9-The user should be asked to enter the info of the employee according to their role
10-The program should then print the info of employees that have the same salary as
the first employee in the Array (use for each loop)
 */

import java.util.Scanner;

class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: $" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;//comparing the object with its self
        Employee employee = (Employee) obj;
        return employee.salary==salary;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

class Engineer extends Employee {
    private String project;

    public Engineer(String name, int age, double salary, String project) {
        super(name, age, salary);
        this.project = project;
    }

    @Override
    public String toString() {
        return super.toString() + ", Project: " + project;
    }
}

class Salesperson extends Employee {
    private double salesTarget;

    public Salesperson(String name, int age, double salary, double salesTarget) {
        super(name, age, salary);
        this.salesTarget = salesTarget;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sales Target: $" + salesTarget;
    }
}

public class CompanyEmployees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.println("Choose role (1. Manager, 2. Engineer, 3. Salesperson): ");
            int role = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (role) {
                case 1:
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    employees[i] = new Manager(name, age, salary, department);
                    break;
                case 2:
                    System.out.print("Enter project: ");
                    String project = scanner.nextLine();
                    employees[i] = new Engineer(name, age, salary, project);
                    break;
                case 3:
                    System.out.print("Enter sales target: ");
                    double salesTarget = scanner.nextDouble();
                    employees[i] = new Salesperson(name, age, salary, salesTarget);
                    break;
                default:
                    System.out.println("Invalid role! Please choose again.");
                    i--; // Decrement i to allow the user to re-enter the information
            }
        }

        // Printing employees with the same salary as the first employee
        System.out.println("Employees with the same salary as the first employee:");
        for (Employee employee : employees) {
            if (employee.equals(employees[0])) {
                System.out.println(employee);
            }
        }
    }
}
