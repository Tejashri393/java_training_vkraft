package vkraft_java_training_Day2;
import java.util.Scanner;

public class TrafficMonitoringSystem {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int totalVehicles = 0;
        int intervals = 12;  
        
        
        for (int i = 1; i <= intervals; i++) {
            System.out.print("Enter the number of vehicles passing in the " + (i * 5) + " minute interval: ");
            int vehicles = scanner.nextInt();
            
            
            totalVehicles += vehicles;
        }
        
        
        double averageVehicles = totalVehicles / (double) intervals;
        
        
        System.out.println("\nTotal vehicles passed through the toll gate in an hour: " + totalVehicles);
        System.out.println("Average vehicles per 5-minute interval: " + averageVehicles);
        
        
        scanner.close();
    }
}
