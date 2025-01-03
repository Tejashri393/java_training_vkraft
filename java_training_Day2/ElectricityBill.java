package vkraft_java_training_Day2;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        
        double billAmount = 0.0;

       
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.0; 
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1.0 + (unitsConsumed - 100) * 2.0; 
        } else {
            billAmount = 100 * 1.0 + 100 * 2.0 + (unitsConsumed - 200) * 3.0;
        }

        
        System.out.println("The electricity bill is: $" + billAmount);

        
        scanner.close();
    }
}
