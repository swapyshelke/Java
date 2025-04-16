import java.util.Arrays;

public class SortThreeNumbers {
    public static void main(String[] args) {
        // Check if 3 arguments are given
        if (args.length != 3) {
            System.out.println("Please enter exactly 3 numbers as command-line arguments.");
            return;
        }

        // Parse the arguments to integers
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Display sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
