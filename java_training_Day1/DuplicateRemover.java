package vkraft_java_training_Day1;
import java.util.Scanner;
import java.util.ArrayList;

public class DuplicateRemover {

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

        
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!uniqueElements.contains(array[i])) {
                uniqueElements.add(array[i]);
            }
        }

        
        System.out.println("Unique elements:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
