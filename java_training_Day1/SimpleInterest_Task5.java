package vkraft_java_training_Day1;
import java.util.Scanner;

public class SimpleInterest_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner  (System.in);
		System.out.println("Enter a princliple amount");
		double principle_amount =  sc.nextDouble();
		System.out.println("Enter a rate");
		float rate = sc.nextFloat();
		System.out.println("Enter a Time in years");
		int time = sc.nextInt();
		
		double simple_interest = (principle_amount*rate*time)/100;
		
		System.out.println("Simple Interest is :" +simple_interest);
		
		
	}

}
