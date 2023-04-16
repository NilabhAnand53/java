import java.io.*;
import java.util.*;

public class Question {
    private static final String FILE_NAME = "questions.txt";
    private static final Scanner scanner = new Scanner(System.in);
    private static List<String> questions = new ArrayList<>();

    public static void main(String[] args) {
        loadQuestions();
        boolean exit = false;
        while (!exit) {
            System.out.println("--------Question Paper Generator--------");
            System.out.println("1. View Questions");
            System.out.println("2. Add a Question");
            System.out.println("3. Remove a Question");
            System.out.println("4. Save Questions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    viewQuestions();
                    break;
                case 2:
                    addQuestion();
                    break;
                case 3:
                    removeQuestion();
                    break;
                case 4:
                    saveQuestions();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        System.out.println("Thank you for using Question Paper Generator!");
    }
