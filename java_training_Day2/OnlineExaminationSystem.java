package vkraft_java_training_Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    
    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    
    public void displayQuestion(int questionNumber) {
        System.out.println("Question " + questionNumber + ": " + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    
    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}


class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    
    public void addQuestion(Question question) {
        questions.add(question);
    }

    
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            question.displayQuestion(i + 1); 
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine(); 

            if (question.checkAnswer(userAnswer)) {
                score++;
            }
        }
        
        System.out.println("\nYour final score: " + score + "/" + questions.size());
    }
}


public class OnlineExaminationSystem {
    public static void main(String[] args) {
       
        Question question1 = new Question(
            "What is the capital of France?", 
            new String[] {"Berlin", "Madrid", "Paris", "Rome"}, 
            "Paris"
        );

        Question question2 = new Question(
            "Which planet is known as the Red Planet?", 
            new String[] {"Earth", "Mars", "Jupiter", "Saturn"}, 
            "Mars"
        );

        Question question3 = new Question(
            "Who developed the theory of relativity?", 
            new String[] {"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"}, 
            "Albert Einstein"
        );

       
        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        
        System.out.println("Welcome to the Online Examination!");
        quiz.startQuiz();
    }
}

