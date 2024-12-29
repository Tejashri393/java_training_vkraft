package vkraft_java_training_Day1;
import java.util.Scanner;
import java.util.Arrays;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);

       
        Arrays.sort(mergedArray);

        
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

