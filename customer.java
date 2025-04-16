package ass3;


import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Customer {
    int customerId;
    String customerName;
    String address;
    String mobileNo;

    public Customer(int customerId, String customerName, String address, String mobileNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.mobileNo = mobileNo;
    }
}

public class a3a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        // Validate number of customers input
        while (!validInput) {
            System.out.print("Enter number of customers: ");
            try {
                n = scanner.nextInt();
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.nextLine(); // consume newline

        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("s:\\JAVAMCA\\ass3\\customers.dat"))) {

            // Writing customer details to file
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for customer " + (i + 1) + ":");
                System.out.print("Customer ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Customer Name: ");
                String name = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Mobile Number: ");
                String mobile = scanner.nextLine();

                // Writing to file
                dos.writeInt(id);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(mobile);
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading and displaying customer details from file
        System.out.println("\n-------- Customer Details --------");
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("s:\\JAVAMCA\\ass3\\customers.dat"))) {

            while (dis.available() > 0) {
                System.out.println("\nCustomer ID: " + dis.readInt());
                System.out.println("Customer Name: " + dis.readUTF());
                System.out.println("Address: " + dis.readUTF());
                System.out.println("Mobile Number: " + dis.readUTF());
                System.out.println("--------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}