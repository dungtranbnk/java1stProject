import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
        questions[1] = new Question(2, "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
        questions[2] = new Question(3, "What is the capital of USA?", "New York", "Washington D.C.", "Los Angeles", "Chicago", "Washington D.C.");
        questions[3] = new Question(4, "What is the capital of UK?", "Manchester", "Birmingham", "London", "Liverpool", "London");
        questions[4] = new Question(5, "What is the capital of Japan?", "Tokyo", "Osaka", "Kyoto", "Hiroshima", "Tokyo");
    }

    public void playQuiz() {
        for (Question question : questions) {
            System.out.println("Question no. :" + question.getId());
            System.out.println(question.getQuestion());
            System.out.println("1. " + question.getOpt1());
            System.out.println("2. " + question.getOpt2());
            System.out.println("3. " + question.getOpt3());
            System.out.println("4. " + question.getOpt4());
            Scanner scanner = new Scanner(System.in);
            selections[question.getId() - 1] = scanner.nextLine();
        }

        for(String selection : selections) {
            System.out.println(selection);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < selections.length; i++) {
            if (selections[i].equals(questions[i].getAnswer())) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
