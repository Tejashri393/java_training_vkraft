package vkraft_java_training_Day1;
import java.util.Scanner;

public class Voating_Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your Age:");
		int age = sc.nextInt();
		System.out.println("Enetr your Country:");
		String country = sc.next() ;
		
		if (age >= 18 && country.equalsIgnoreCase("India")) {
		
            System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voating");
		}
		
		

	}

}
