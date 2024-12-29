package vkraft_java_training_Day1;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

       
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
}

	
