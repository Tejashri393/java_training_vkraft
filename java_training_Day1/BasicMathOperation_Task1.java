package vkraft_java_training_Day1;
import java.util.Scanner;

public class BasicMathOperation_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter a operator");
		char operator = sc.next().charAt(0);
		int result;
		
		switch (operator) {
		case '+': result = num1+num2;
        System.out.println("Addition : " +result );
        break;
		case '-': result = num1-num2;
        System.out.println("Subtraction : " +result );
        break;
		case '*': result = num1*num2;
        System.out.println("Multiplication : " +result );
        break;
		case '/': result = num1/num2;
        System.out.println("Division : " +result );
        break;
		default: System.out.println("invalid operator ");
		   break;


		}
		

	}

}
