package vkraft_java_training_Day1;
import java.util.Scanner;

public class TrafficLightSystem_Task8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for traffic light color
        System.out.println("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = sc.nextLine().trim().toLowerCase();

        // Input for obstacle
        System.out.println("Is there an obstacle in the way? (yes/no): ");
        String obstacle = sc.nextLine().trim().toLowerCase();

        // Logic to determine action based on traffic light color and obstacle
        if (obstacle.equals("yes")) {
            System.out.println("Obstacle detected! Stop.");
        } else {
            switch (lightColor) {
                case "green":
                    System.out.println("Traffic light is Green: Go.");
                    break;
                case "yellow":
                    System.out.println("Traffic light is Yellow: Slow Down.");
                    break;
                case "red":
                    System.out.println("Traffic light is Red: Stop.");
                    break;
                default:
                    System.out.println("Invalid traffic light color! Please enter Green, Yellow, or Red.");
            }
        }

        sc.close();
    }
}