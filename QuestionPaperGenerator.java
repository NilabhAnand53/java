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

    private static void loadQuestions() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                questions.add(line);
            }
            System.out.println("Questions loaded successfully from " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println("Questions file not found: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error while reading questions file: " + e.getMessage());
        }
    }

    private static void viewQuestions() {
        if (questions.isEmpty()) {
            System.out.println("No questions found.");
            return;
        }
        System.out.println("--------View Questions--------");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }

    private static void addQuestion() {
        System.out.println("--------Add a Question--------");
        System.out.print("Enter the question: ");
        String question = scanner.nextLine();
        questions.add(question);
        System.out.println("Question added successfully.");
    }

    private static void removeQuestion() {
        if (questions.isEmpty()) {
            System.out.println("No questions found to remove.");
            return;
        }
        