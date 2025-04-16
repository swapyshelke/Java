import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        // Create array
        int[] numbers = new int[n];
        int sum = 0;

        // Accept numbers and calculate sum
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];  // Add to sum
        }

        // Display the sum
        System.out.println("Sum of all elements: " + sum);

        sc.close();
    }
}


/*

🧪 Sample Output:

Enter how many numbers you want to enter: 4
Enter 4 numbers:
Number 1: 10
Number 2: 20
Number 3: 30
Number 4: 40
Sum of all elements: 100

*/