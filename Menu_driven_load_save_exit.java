package ass3;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class a3b1 {
    private static int[] numbers = new int[10];
    private static Random random = new Random();
    
    public static void loadNumbers() {
        System.out.println("\nGenerated Random Numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(90) + 10; // Generates numbers between 10-99
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    public static void saveNumbers() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("s:\\JAVAMCA\\ass3\\number.txt"))) {
            for (int number : numbers) {
                writer.println(number);
            }
            System.out.println("\nNumbers saved successfully to number.txt");
        } catch (IOException e) {
            System.out.println("\nError saving numbers: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Load Random Numbers");
            System.out.println("2. Save Numbers to File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            try {
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        loadNumbers();
                        break;
                    case 2:
                        saveNumbers();
                        break;
                    case 3:
                        System.out.println("\nExiting program...");
                        break;
                    default:
                        System.out.println("\nInvalid choice! Please enter 1-3");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid input! Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                choice = 0;
            }
            
        } while (choice != 3);
        
        scanner.close();
    }
}