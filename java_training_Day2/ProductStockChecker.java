package vkraft_java_training_Day2;
import java.util.Scanner;

public class ProductStockChecker {
	 public static void main(String[] args) {
	        
	        int numberOfProducts = 5;
	        
	        
	        int threshold = 10;
	        
	       
	        String[] productNames = new String[numberOfProducts];
	        int[] productStocks = new int[numberOfProducts];
	        
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        for (int i = 0; i < numberOfProducts; i++) {
	            System.out.print("Enter the name of product " + (i + 1) + ": ");
	            productNames[i] = scanner.nextLine();
	            
	            System.out.print("Enter the stock of " + productNames[i] + ": ");
	            productStocks[i] = scanner.nextInt();
	            scanner.nextLine(); 
	        }
	        
	        
	        System.out.println("\nProduct Stock Status:");
	        for (int i = 0; i < numberOfProducts; i++) {
	            System.out.println("Product: " + productNames[i] + ", Stock: " + productStocks[i]);
	            if (productStocks[i] < threshold) {
	                System.out.println("Warning: " + productNames[i] + " stock is below threshold. Please reorder.");
	            }
	        }
	        
	        
	        scanner.close();
	    }
	}
