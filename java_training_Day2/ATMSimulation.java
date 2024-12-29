package vkraft_java_training_Day2;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; 
        int userChoice;
        
        
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");
            userChoice = scanner.nextInt();
            
            switch (userChoice) {
                case 1:
                    
                    System.out.println("Your current balance is: $" + balance);
                    break;
                
                case 2:
                    
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                
                case 3:
                    
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn $" + withdrawAmount);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                
                case 4:
                    
                    System.out.println("Exiting the ATM. Thank you for using our services!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        } while (userChoice != 4); 
        
        scanner.close();
    }
}

