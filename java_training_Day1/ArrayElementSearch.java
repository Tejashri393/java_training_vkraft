package vkraft_java_training_Day1;
import java.util.Scanner;

public class ArrayElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Initialize the array
	        int[] numbers = new int[size];

	        // Input the elements of the array
	        System.out.println("Enter " + size + " integers:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        // Input the element to search for
	        System.out.print("Enter the element to search for: ");
	        int target = sc.nextInt();

	        // Search for the element
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (numbers[i] == target) {
	                System.out.println("Element " + target + " found at position: " + (i + 1));
	                found = true;
	                break;
	            }
	        }

	        // If the element is not found
	        if (!found) {
	            System.out.println("Element " + target + " not found in the array.");
	        }

	        sc.close();
	    }
	}
