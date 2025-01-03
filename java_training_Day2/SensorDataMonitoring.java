package vkraft_java_training_Day2;
import java.util.Random;


public class SensorDataMonitoring {
	public static void main(String[] args) {
       
        final int threshold = 75;
        
        
        Random random = new Random();
        
        
        int readingCount = 0;
        int highestValue = Integer.MIN_VALUE;
        
        
        while (true) {
           
            int sensorValue = random.nextInt(101);
            readingCount++;
            
            
            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }
            
           
            System.out.println("Reading " + readingCount + ": " + sensorValue);
            
            
            if (sensorValue > threshold) {
                break;
            }
        }
        
        
        System.out.println("\nSensor Monitoring Stopped.");
        System.out.println("Total Readings Taken: " + readingCount);
        System.out.println("Highest Value Recorded: " + highestValue);
    }
}
