package vkraft_java_training_Day2;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double[] grades;
    private int attendance;

    
    public Student(String name, int rollNumber, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
        this.attendance = 0; 
    }

    
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Grade: " + calculateAverageGrade());
        System.out.println("Attendance: " + attendance + " days");
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    // Method to mark attendance
    public void markAttendance() {
        attendance++;
        System.out.println("Attendance marked for " + name + ". Total attendance: " + attendance + " days.");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details from the user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        double[] grades = new double[numGrades];
        System.out.println("Enter the grades:");
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Create a student object
        Student student = new Student(name, rollNumber, grades);

        // Menu to perform operations
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display Student Details");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student.displayDetails();
                    break;
                case 2:
                    student.markAttendance();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


