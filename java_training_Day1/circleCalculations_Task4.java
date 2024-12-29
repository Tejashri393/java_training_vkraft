package vkraft_java_training_Day1;
import java.util.Scanner;

public class circleCalculations_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc =  new Scanner (System.in);
		System.out.println( "Enter a radius");
		double radius = sc.nextDouble();
		double circumferance = 2 *3.14*radius;
		double area = 3.14 *radius *radius;
		System.out.println("Area of Circle:" + area);
		
		System.out.println("circumferance of Circle:" + circumferance);
		
	}

}
