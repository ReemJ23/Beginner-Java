/*
    Create a Java class called Student to represent students. The class should have the following attributes:

    String name: to store the name of the student.
    int age: to store the age of the student.
    double gpa: to store the GPA of the student.
    Include appropriate constructors and methods to access and modify these attributes.

    In the main method, create an array of Student objects to store information about multiple students.
    Prompt the user to enter the number of Students then to enter the details (name, age, GPA) for each
    student and store them in the array. Afterward, calculate the average of their GPA (use foreach) and print it.
 */


import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of students: ");
//        int numStudents = scanner.nextInt();
//
//        // Create an array to hold the Student objects
//        Student[] students = new Student[numStudents];
//
//        // Prompt user to enter details for each student
//        for (int i = 0; i < numStudents; i++) {
//            System.out.println("\nEnter details for student " + (i + 1) + ":");
//            System.out.print("Name: ");
//            String name = scanner.next();
//            System.out.print("Age: ");
//            int age = scanner.nextInt();
//            System.out.print("GPA: ");
//            double gpa = scanner.nextDouble();
//
//            // Create a new Student object and add it to the array
//            students[i] = new Student(name, age, gpa);
//        }
//
//        // Calculate the average GPA
//        double totalGpa = 0;
//        for (Student student : students) {
//            totalGpa += student.getGpa();
//        }
//        double averageGpa = totalGpa / numStudents;
//        System.out.println("The average of the students GPA: "+averageGpa);
//
//    }
//}

