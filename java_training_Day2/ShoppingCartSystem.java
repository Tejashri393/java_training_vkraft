package vkraft_java_training_Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Product {
    private String name;
    private double price;
    private int quantity;

   
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Calculate the total price for this product
    public double calculateTotalPrice() {
        return price * quantity;
    }
}

// Cart class to manage the shopping cart
class Cart {
    private List<Product> products;

    // Constructor to initialize the cart
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    // Method to remove a product from the cart
    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println(productName + " removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    // Method to calculate the total price of all products in the cart
    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }

    // Method to display all products in the cart
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("\nShopping Cart:");
            for (Product product : products) {
                product.displayProduct();
            }
        }
    }
}


public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        
        while (true) {
            System.out.println("\n--- Shopping Cart System ---");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    Product product = new Product(name, price, quantity);
                    cart.addProduct(product);
                    break;

                case 2:
                   
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    break;

                case 3:
                    
                    cart.displayCart();
                    break;

                case 4:
                    
                    double totalPrice = cart.calculateTotalPrice();
                    System.out.println("Total Price: " + totalPrice);
                    break;

                case 5:
                    
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }
}


