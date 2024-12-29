package vkraft_java_training_Day1;

import java.util.Scanner;

public class TempConCelciusToFahrenheit_Task6_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = celsius * (9.0 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * (5.0 / 9);
                System.out.println("Temperature in Celsius: " + celsius);
                break;

            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }

        sc.close();
    }
}
