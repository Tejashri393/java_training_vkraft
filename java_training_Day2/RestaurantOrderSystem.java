package vkraft_java_training_Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemCategory;

    
    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }

    
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    
    public void displayItem() {
        System.out.println(itemName + " - " + itemCategory + " - " + itemPrice);
    }
}


class Restaurant {
    private List<MenuItem> menu;
    private List<MenuItem> orders;

    
    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
        
        menu.add(new MenuItem("Pizza", 8.99, "Main Course"));
        menu.add(new MenuItem("Burger", 5.49, "Main Course"));
        menu.add(new MenuItem("Pasta", 7.99, "Main Course"));
        menu.add(new MenuItem("Ice Cream", 3.49, "Dessert"));
        menu.add(new MenuItem("Soda", 1.99, "Beverage"));
    }

    
    public void displayMenu() {
        System.out.println("\n--- Menu ---");
        for (MenuItem item : menu) {
            item.displayItem();
        }
    }

    
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;
        while (ordering) {
            System.out.print("\nEnter item name to order (or type 'done' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                ordering = false;
            } else {
                boolean found = false;
                for (MenuItem item : menu) {
                    if (item.getItemName().equalsIgnoreCase(itemName)) {
                        orders.add(item);
                        System.out.println(itemName + " added to your order.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found on the menu. Please try again.");
                }
            }
        }
    }

    
    public void displayBill() {
        if (orders.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        double total = 0;
        System.out.println("\n--- Your Order ---");
        for (MenuItem item : orders) {
            System.out.println(item.getItemName() + " - " + item.getItemPrice());
            total += item.getItemPrice();
        }
        System.out.println("Total Bill: $" + total);
    }
}


public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

       
        restaurant.displayMenu();

       
        restaurant.takeOrder();

        
        restaurant.displayBill();
    }
}

