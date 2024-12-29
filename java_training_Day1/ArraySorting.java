package vkraft_java_training_Day1;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

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

        
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        
        System.out.print("Array in descending order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}

	


