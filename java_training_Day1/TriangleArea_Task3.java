package vkraft_java_training_Day1;
import java.util.Scanner;

public class TriangleArea_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		System.out.println ("Calculate Area of Traingle:");
		System.out.println ("Enter a Traingle Base:");
		int base = sc.nextInt();
		System.out.println ("Enter a Traingle Height:");
		int height = sc.nextInt();
		double area  = 0.5*base*height;
		System.out.println("Area of Traingle is:" + area);
		 
		 
		
	}

}
