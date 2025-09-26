
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {

    private static final String FILE_NAME = "notes.txt"; // stores notes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== NOTES APP =====");
            System.out.println("1. Add a new note");
            System.out.println("2. View all notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {        // Handle invalid menu input
                System.out.println("Please enter a valid number!");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNote(scanner);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting Notes App. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Adds a note to notes.txt
    private static void addNote(Scanner scanner) {
        System.out.print("Type your note: ");
        String note = scanner.nextLine();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // true = append
            writer.write(note + System.lineSeparator());
            System.out.println("✅ Note saved!");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // Displays all notes from notes.txt
    private static void viewNotes() {
        System.out.println("\n----- Your Notes -----");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean hasNotes = false;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
                hasNotes = true;
            }
            if (!hasNotes) {
                System.out.println("(No notes found)");
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading from file: " + e.getMessage());
        }
        System.out.println("----------------------");
    }
}
