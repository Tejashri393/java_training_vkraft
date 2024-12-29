package vkraft_java_training_Day1;
import java.util.Scanner;

public class FindReminder_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println ("Enter num2");
		int num2 =  sc.nextInt();
		int result;
		if(num1>num2) {
			result =  num1% num2;
			System.out.println ("reminder is : " +result );
			
		}
		else {
			System.out.println ("num1 is not greater than num2");
		}

	}

}
