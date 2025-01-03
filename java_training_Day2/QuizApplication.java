package vkraft_java_training_Day2;
import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
        
        String[] questions = {
            "What is the capital of France?",
            "Which programming language is used for Android development?",
            "What is 2 + 2?",
            "What is the largest planet in our solar system?"
        };
        
        String[] answers = {
            "Paris",       // Answer to question 1
            "Java",        // Answer to question 2
            "4",           // Answer to question 3
            "Jupiter"      // Answer to question 4
        };

       
        Scanner scanner = new Scanner(System.in);
        
        
        int score = 0;
        
        
        for (int i = 0; i < questions.length; i++) {
            
            System.out.println((i + 1) + ". " + questions[i]);
            
            
            String userAnswer = scanner.nextLine();
            
            
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;  
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }
        
        
        System.out.println("\nQuiz Complete!");
        System.out.println("Your score is: " + score + "/" + questions.length);
        
        
        scanner.close();
    }
}
