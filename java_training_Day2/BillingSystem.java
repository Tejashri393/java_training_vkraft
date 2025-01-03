package vkraft_java_training_Day2;
import java.util.Scanner;

public class BillingSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        
        for (int customer = 1; customer <= numCustomers; customer++) {
            double totalBill = 0; 
            System.out.println("\nEnter the details for Customer " + customer + ":");
            System.out.println("Enter items purchased by the customer. Type 'done' when finished.");

            while (true) {
                
                System.out.print("Enter item name (or 'done' to finish): ");
                scanner.nextLine();  // Clear the buffer
                String item = scanner.nextLine();
                
                
                if (item.equalsIgnoreCase("done")) {
                    break;
                }

                
                System.out.print("Enter the price of " + item + ": ");
                double price = scanner.nextDouble();
                
                
                System.out.print("Enter the quantity of " + item + ": ");
                int quantity = scanner.nextInt();
                
                
                totalBill += price * quantity;
            }

            
            System.out.println("Total bill for Customer " + customer + ": $" + totalBill);
        }
        
        
        scanner.close();
    }
}
