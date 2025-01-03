package vkraft_java_training_Day2;
import java.util.Scanner;

public class OnlineExamTimer {
	public static void main(String[] args) {
        
        int totalTime = 60;
        
       
        while (totalTime > 0) {
            
            System.out.println("Time remaining: " + totalTime + " minutes");
            
            
            totalTime--;
            
           
            try {
                Thread.sleep(60000); 
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted.");
            }
        }
        
        
        System.out.println("Time's up! The exam has ended.");
    }
}
