package vkraft_java_training_Day1;
 import java.util.Scanner;
public class PasswordValidation_Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your Password:");
		String password = sc.next();	
		
		if (password.length() >= 8 && password.matches(".*[A-Za-z].*") && password.matches(".*[0-9].*")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long and contain both letters and numbers.");
        }
	 }
	}
