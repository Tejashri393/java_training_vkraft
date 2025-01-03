package vkraft_java_training_Day2;
import java.util.Scanner;

public class BankTransactionHistory {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        double balance = 0.0;

	        int choice;
	        do {
	           
	            System.out.println("\nBank Account Transaction Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Quit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            
	            switch (choice) {
	                case 1:
	                   
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    if (depositAmount > 0) {
	                        balance += depositAmount;
	                        System.out.println("Deposited: $" + depositAmount);
	                    } else {
	                        System.out.println("Invalid deposit amount. Please enter a positive number.");
	                    }
	                    break;
	                case 2:
	                    
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.println("Withdrawn: $" + withdrawAmount);
	                    } else if (withdrawAmount > balance) {
	                        System.out.println("Insufficient balance for withdrawal.");
	                    } else {
	                        System.out.println("Invalid withdrawal amount. Please enter a positive number.");
	                    }
	                    break;
	                case 3:
	                   
	                    System.out.println("Exiting the transaction system. Goodbye!");
	                    break;
	                default:
	                    
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }

	            
	            System.out.println("Updated Balance: $" + balance);

	        } while (choice != 3); 

	       
	        scanner.close();
	    }
	}
