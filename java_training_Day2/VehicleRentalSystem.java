package vkraft_java_training_Day2;

import java.util.Scanner;

//Base Vehicle class
class Vehicle {
 protected String vehicleType;
 protected String numberPlate;
 protected double rentalPricePerDay;

 public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
     this.vehicleType = vehicleType;
     this.numberPlate = numberPlate;
     this.rentalPricePerDay = rentalPricePerDay;
 }

 public double calculateRentalCost(int days) {
     return days * rentalPricePerDay;
 }

 public void displayDetails() {
     System.out.println("Vehicle Type: " + vehicleType);
     System.out.println("Number Plate: " + numberPlate);
     System.out.println("Rental Price Per Day: " + rentalPricePerDay);
 }
}

//Car subclass
class Car extends Vehicle {
 private int numberOfSeats;

 public Car(String numberPlate, double rentalPricePerDay, int numberOfSeats) {
     super("Car", numberPlate, rentalPricePerDay);
     this.numberOfSeats = numberOfSeats;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Number of Seats: " + numberOfSeats);
 }
}

//Bike subclass
class Bike extends Vehicle {
 private boolean hasHelmet;

 public Bike(String numberPlate, double rentalPricePerDay, boolean hasHelmet) {
     super("Bike", numberPlate, rentalPricePerDay);
     this.hasHelmet = hasHelmet;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Helmet Included: " + (hasHelmet ? "Yes" : "No"));
 }
}

//Truck subclass
class Truck extends Vehicle {
 private double loadCapacity; // in tons

 public Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
     super("Truck", numberPlate, rentalPricePerDay);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Load Capacity: " + loadCapacity + " tons");
 }
}

//Main class
public class VehicleRentalSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter number of vehicles to rent: ");
     int numVehicles = scanner.nextInt();

     for (int i = 0; i < numVehicles; i++) {
         System.out.println("\nEnter details for Vehicle " + (i + 1) + ":");
         System.out.print("Enter Vehicle Type (1 for Car, 2 for Bike, 3 for Truck): ");
         int vehicleType = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         System.out.print("Enter Number Plate: ");
         String numberPlate = scanner.nextLine();

         System.out.print("Enter Rental Price Per Day: ");
         double rentalPricePerDay = scanner.nextDouble();

         System.out.print("Enter Number of Days Rented: ");
         int daysRented = scanner.nextInt();

         Vehicle vehicle = null;

         if (vehicleType == 1) {
             // Car
             System.out.print("Enter Number of Seats: ");
             int numberOfSeats = scanner.nextInt();
             vehicle = new Car(numberPlate, rentalPricePerDay, numberOfSeats);
         } else if (vehicleType == 2) {
             // Bike
             System.out.print("Does it include a Helmet? (1 for Yes, 0 for No): ");
             boolean hasHelmet = scanner.nextInt() == 1;
             vehicle = new Bike(numberPlate, rentalPricePerDay, hasHelmet);
         } else if (vehicleType == 3) {
             // Truck
             System.out.print("Enter Load Capacity (in tons): ");
             double loadCapacity = scanner.nextDouble();
             vehicle = new Truck(numberPlate, rentalPricePerDay, loadCapacity);
         } else {
             System.out.println("Invalid Vehicle Type!");
             continue;
         }

         // Display Vehicle Details and Calculate Total Rental Cost
         System.out.println("\n--- Vehicle Details ---");
         vehicle.displayDetails();
         System.out.println("Total Rental Cost for " + daysRented + " days: " + vehicle.calculateRentalCost(daysRented));
     }

     scanner.close();
 }
}


