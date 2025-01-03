package vkraft_java_training_Day2;
import java.util.Scanner;

public class CinemaSeatReservationSystem {
	public static void main(String[] args) {
        
        int rows = 5;
        int cols = 5;
        
        
        char[][] seats = new char[rows][cols];
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A';  
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        int row, col;
        char continueChoice;
        
        
        do {
            
            displaySeats(seats);
            
            
            System.out.print("Enter the row number (1-" + rows + "): ");
            row = scanner.nextInt() - 1; 
            System.out.print("Enter the column number (1-" + cols + "): ");
            col = scanner.nextInt() - 1; 
            
            // Check if the seat is available
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (seats[row][col] == 'A') {
                    seats[row][col] = 'R';  
                    System.out.println("Seat successfully reserved!");
                } else {
                    System.out.println("Sorry, this seat is already reserved. Please choose another.");
                }
            } else {
                System.out.println("Invalid seat number. Please try again.");
            }
            
            
            System.out.print("Do you want to reserve another seat? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
            
        } while (continueChoice == 'Y' || continueChoice == 'y');
        
       
        System.out.println("\nFinal Seating Arrangement:");
        displaySeats(seats);
        
       
        scanner.close();
    }

   
    public static void displaySeats(char[][] seats) {
        System.out.println("\nCinema Seat Arrangement:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
