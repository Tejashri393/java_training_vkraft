package vkraft_java_training_Day2;
import java.util.Scanner;

public class OnlineShoppingDiscount {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of items in the cart: ");
        int numItems = scanner.nextInt();

        
        double totalPrice = 0.0;

        
        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalPrice += price; 
        }

        
        double discount = 0.0;
        if (totalPrice > 500) {
            discount = totalPrice * 0.10; 
        } else if (totalPrice >= 200 && totalPrice <= 500) {
            discount = totalPrice * 0.05; 
        }

        
        double finalPrice = totalPrice - discount;

        
        System.out.println("Total price before discount: $" + totalPrice);
        System.out.println("Discount applied: $" + discount);
        System.out.println("Final price after discount: $" + finalPrice);

        
        scanner.close();
    }
}
