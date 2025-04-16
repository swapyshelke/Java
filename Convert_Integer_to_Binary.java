import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a decimal number
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        // Convert to binary using Integer.toBinaryString()
        String binary = Integer.toBinaryString(number);

        // Display result
        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}
