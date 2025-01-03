package vkraft_java_training_Day2;
import java.util.Scanner;

public class EmployeeAttendanceTracker {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of employees: ");
	        int numEmployees = scanner.nextInt();

	        
	        String[][] attendance = new String[7][numEmployees];

	        
	        for (int i = 0; i < numEmployees; i++) {
	            System.out.println("\nEnter attendance for Employee " + (i + 1) + ":");
	            for (int j = 0; j < 7; j++) {
	                System.out.print("Day " + (j + 1) + " (Present/Absent): ");
	                attendance[j][i] = scanner.next();
	            }
	        }

	        
	        System.out.println("\nEmployee Attendance for the Week:");
	        System.out.println("Employee | Day 1 | Day 2 | Day 3 | Day 4 | Day 5 | Day 6 | Day 7");

	        for (int i = 0; i < numEmployees; i++) {
	            System.out.print("Employee " + (i + 1) + " | ");
	            for (int j = 0; j < 7; j++) {
	                System.out.print(attendance[j][i] + " | ");
	            }
	            System.out.println();
	        }

	        
	        scanner.close();
	    }
	}
