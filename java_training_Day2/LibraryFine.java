package vkraft_java_training_Day2;
import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        
       
        for (int i = 1; i <= numBooks; i++) {
            System.out.println("\nEnter the details for book " + i + ":");
            System.out.print("Enter the number of overdue days: ");
            int overdueDays = scanner.nextInt();
            
            double fine = 0;

            
            if (overdueDays <= 7) {
                fine = overdueDays * 1;  
            } else {
                fine = 7 * 1 + (overdueDays - 7) * 2; 
            }

            
            System.out.println("Total fine for book " + i + ": $" + fine);
        }

        
        scanner.close();
    }
}
