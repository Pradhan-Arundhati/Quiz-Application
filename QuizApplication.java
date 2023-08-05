import java.util.Scanner;

class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

public class QuizApplication {
    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of questions
        Question[] questions = {
            new Question("What is the capital of France?", new String[]{"London", "Paris", "Berlin", "Madrid"}, 1),
            new Question("Which planet is known as the Red Planet?", new String[]{"Venus", "Mars", "Jupiter", "Saturn"}, 1),
            new Question("What is the chemical symbol for water?", new String[]{"H2O", "CO2", "O2", "CH4"}, 0),
            new Question("Who wrote the play 'Romeo and Juliet'?", new String[]{"William Shakespeare", "Jane Austen", "Mark Twain", "Leo Tolstoy"}, 0),
            new Question("What is the largest mammal in the world?", new String[]{"Elephant", "Giraffe", "Blue Whale", "Hippopotamus"}, 2)
        };

        // Start the quiz
        System.out.println("Welcome to the Quiz Application!");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestion());
            String[] options = questions[i].getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            System.out.print("Enter your answer (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == questions[i].getCorrectAnswer() + 1) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + options[questions[i].getCorrectAnswer()]);
            }
            System.out.println();
        }

        // Display the final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
