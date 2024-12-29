package vkraft_java_training_Day1;
import java.util.Scanner;

public class ArraySecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Check for valid size
        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        
        int[] numbers = new int[size];

       
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

       
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements are the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        sc.close();
    }
}
