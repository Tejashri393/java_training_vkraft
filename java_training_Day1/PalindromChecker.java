package vkraft_java_training_Day1;
import java.util.Scanner;

public class PalindromChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String string = sc.next();
		String reversedString = new StringBuilder(string).reverse().toString();

        
        if (string.equalsIgnoreCase(reversedString)) {
            System.out.println("\"" + string + "\" is a palindrome.");
        } else {
            System.out.println("\"" + string + "\" is not a palindrome.");
        }
		


	}

}
