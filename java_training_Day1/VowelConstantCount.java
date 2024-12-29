package vkraft_java_training_Day1;
import java.util.Scanner;

public class VowelConstantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner sc = new Scanner(System.in);



	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();



	        int vowels = 0, consonants = 0;

	        
	        input = input.toLowerCase();

	       
	        for (char ch : input.toCharArray()) {
	            if (ch >= 'a' && ch <= 'z') { 
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }



	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);

	        sc.close();
	    }
	}
