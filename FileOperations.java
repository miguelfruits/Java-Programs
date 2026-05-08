//To store record in a file and find out following output.
	//1  for input data
	//2  for Display data
	//3  for count no of characters from file
	//4  for count no of space from file
	//5  for count no of word from file
	//6  for count no of space, character from file

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    static final String FILE_NAME = "records.txt";

    // Method to write data into the file
    public static void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data to store in file:");
            String data = sc.nextLine();
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
        }
    }

    // Method to display data from the file
    public static void displayData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading data: " + e.getMessage());
        }
    }

    // Method to count number of characters in the file
    public static void countCharacters() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            int charCount = 0;
            int ch;
            while ((ch = reader.read()) != -1) {
                charCount++;
            }
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.out.println("An error occurred while counting characters: " + e.getMessage());
        }
    }

    // Method to count number of spaces in the file
    public static void countSpaces() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            int spaceCount = 0;
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == ' ') {
                    spaceCount++;
                }
            }
            System.out.println("Number of spaces: " + spaceCount);
        } catch (IOException e) {
            System.out.println("An error occurred while counting spaces: " + e.getMessage());
        }
    }

    // Method to count number of words in the file
    public static void countWords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while counting words: " + e.getMessage());
        }
    }

    // Method to count characters and spaces in one go
    public static void countSpacesAndCharacters() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            int charCount = 0;
            int spaceCount = 0;
            int ch;
            while ((ch = reader.read()) != -1) {
                charCount++;
                if (ch == ' ') {
                    spaceCount++;
                }
            }
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of spaces: " + spaceCount);
        } catch (IOException e) {
            System.out.println("An error occurred while counting characters and spaces: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Count characters");
            System.out.println("4. Count spaces");
            System.out.println("5. Count words");
            System.out.println("6. Count spaces and characters");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    writeData();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    countCharacters();
                    break;
                case 4:
                    countSpaces();
                    break;
                case 5:
                    countWords();
                    break;
                case 6:
                    countSpacesAndCharacters();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
