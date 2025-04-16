import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        // Handle division safely
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            // Display results
            System.out.println("\nResults:");
            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + diff);
            System.out.println("Multiplication: " + prod);
            System.out.println("Division: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("\nDivision and remainder can't be calculated as second number is 0.");
            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + diff);
            System.out.println("Multiplication: " + prod);
        }

        sc.close();
    }
}


/**
 Sample o/p
 
 Enter first number: 15
Enter second number: 4

Results:
Addition: 19
Subtraction: 11
Multiplication: 60
Division: 3
Remainder: 3

 */