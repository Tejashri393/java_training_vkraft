package vkraft_java_training_Day2;
import java.util.Scanner;

public class RestaurantMenuOrdering {
	 public static void main(String[] args) {
	        
	        String[] menuItems = {"Burger - $5", "Pizza - $8", "Pasta - $7", "Salad - $4", "Soda - $2"};
	        double[] prices = {5, 8, 7, 4, 2};
	        
	        Scanner scanner = new Scanner(System.in);
	        double totalCost = 0;  
	        StringBuilder orderSummary = new StringBuilder("Your order:\n");  
	        
	        System.out.println("Welcome to the restaurant! Here is the menu:");
	        
	        
	        for (int i = 0; i < menuItems.length; i++) {
	            System.out.println((i + 1) + ". " + menuItems[i]);
	        }
	        
	        
	        while (true) {
	            System.out.print("\nEnter the number of the item you want to order (1-" + menuItems.length + "), or 0 to stop: ");
	            int choice = scanner.nextInt();
	            
	            if (choice == 0) {
	                break;  
	            }
	            
	            if (choice > 0 && choice <= menuItems.length) {
	                
	                totalCost += prices[choice - 1];
	                orderSummary.append(menuItems[choice - 1]).append("\n");
	            } else {
	                System.out.println("Invalid choice, please try again.");
	            }
	        }

	        
	        if (totalCost > 0) {
	            System.out.println("\nOrder Summary:");
	            System.out.println(orderSummary);
	            System.out.println("Total Cost: $" + totalCost);
	        } else {
	            System.out.println("No items ordered.");
	        }

	        
	        scanner.close();
	    }
	}
