package vkraft_java_training_Day2;
import java.util.Scanner;

public class DailyStepTracker {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] steps = new int[7];
        
        
        int totalSteps = 0;
        
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps taken on day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();
            totalSteps += steps[i];  
        }
        
        
        double averageSteps = totalSteps / 7.0;
        
        
        System.out.println("\nTotal steps taken in the week: " + totalSteps);
        System.out.println("Average steps per day: " + averageSteps);
        
       
        scanner.close();
    }
}
