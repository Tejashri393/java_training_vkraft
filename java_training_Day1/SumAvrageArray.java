package vkraft_java_training_Day1;
import java.util.Scanner;

public class SumAvrageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

       
        int[] numbers = new int[size];
        int sum = 0;

       
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // Calculate sum during input
        }

        
        double average = (double) sum / size;

        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        sc.close();
    }
}

	