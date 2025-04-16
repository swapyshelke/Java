import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        // Create array to store numbers
        int[] numbers = new int[n];

        // Accept numbers from user
        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find the largest number
        int largest = numbers[0]; // assume first is largest
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display largest number
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
