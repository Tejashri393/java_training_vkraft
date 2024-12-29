package vkraft_java_training_Day1;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

       
        System.out.print("Enter the number of positions to rotate: ");
        int n = sc.nextInt();

        
        n = n % size;

        
        int[] rotatedArray = new int[size];
        for (int i = 0; i < size; i++) {
            rotatedArray[i] = array[(i + n) % size];
        }

        
        System.out.println("Rotated Array:");
        for (int element : rotatedArray) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
