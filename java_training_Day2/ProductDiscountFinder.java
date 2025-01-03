package vkraft_java_training_Day2;
import java.util.Scanner;

public class ProductDiscountFinder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        
        for (int i = 1; i <= numProducts; i++) {
            System.out.println("\nProduct " + i);

            
            System.out.print("Enter the price of the product: $");
            double price = scanner.nextDouble();

            
            System.out.print("Enter the discount percentage: ");
            double discountPercentage = scanner.nextDouble();

            
            double discountAmount = (price * discountPercentage) / 100;
            double discountedPrice = price - discountAmount;

            
            System.out.printf("The discounted price of the product is: $%.2f%n", discountedPrice);
        }

        System.out.println("\nAll products processed. Thank you!");
        scanner.close();
    }
}
