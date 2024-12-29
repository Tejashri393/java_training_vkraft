package vkraft_java_training_Day1;
import java.util.Scanner;

public class LargrstSmallestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];



        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        
        int largest = numbers[0];
        int smallest = numbers[0];

        
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        sc.close();
    }
}
		

