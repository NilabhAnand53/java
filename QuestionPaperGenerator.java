import java.util.Scanner;

public class QuestionPaperGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Question Paper Generator-----");
            System.out.println("1. Add a new question");
            System.out.println("2. Remove a question");
            System.out.println("3. Edit a question");
            System.out.println("4. Generate a question paper");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addQuestion();
                    break;
                case 2:
                    removeQuestion();
                    break;
                case 3:
                    editQuestion();
                    break;
                case 4:
                    generateQuestionPaper();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        } while (choice != 5);
        scanner.close();
    }

    private static void addQuestion() {
        // code to add a new question
        System.out.println("Adding a new question...");
    }

    private static void removeQuestion() {
        // code to remove a question
        System.out.println("Removing a question...");
    }

    private static void editQuestion() {
        // code to edit a question
        System.out.println("Editing a question...");
    }

    private static void generateQuestionPaper() {
        // code to generate a question paper
        System.out.println("Generating a question paper...");
    }
}