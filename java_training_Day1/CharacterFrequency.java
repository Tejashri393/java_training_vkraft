package vkraft_java_training_Day1;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        char[] chars = input.toCharArray();

        
        for (int i = 0; i < chars.length; i++) {
            
            if (chars[i] == ' ') {
                continue;
            }

            int count = 1;
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = ' '; 
                }
            }

            
            if (chars[i] != ' ') {
                System.out.println(chars[i] + ": " + count);
            }
        }

        sc.close();
    }
}
