package vkraft_java_training_Day2;
import java.util.Scanner;

public class StudentGradingSystem {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        double totalGrades = 0;
        boolean hasFailed = false;

        
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();

            
            totalGrades += grade;

            
            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
                hasFailed = true;
            }
        }

        
        double averageGrade = totalGrades / numStudents;
        System.out.println("\nAverage grade of all students: " + averageGrade);

        
        if (hasFailed) {
            System.out.println("Some students have failed.");
        } else {
            System.out.println("All students have passed.");
        }

        
        scanner.close();
    }
}
