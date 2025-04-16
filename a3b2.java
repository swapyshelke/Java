package ass3;



import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

public class a3b2 {
    private int day;
    private int month;
    private int year;

    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter day (dd): ");
        day = scanner.nextInt();
        System.out.print("Enter month (mm): ");
        month = scanner.nextInt();
        System.out.print("Enter year (yyyy): ");
        year = scanner.nextInt();
        
        validateDate();
    }

    private void validateDate() throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month. Month should be between 1 and 12");
        }

        if (day < 1 || day > 31) {
            throw new InvalidDateException("Invalid day. Day should be between 1 and 31");
        }

        // Check for months with 30 days
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            throw new InvalidDateException("Invalid day. This month can have maximum 30 days");
        }

        // February special check
        if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear && day > 29) {
                throw new InvalidDateException("Invalid day. February can have maximum 29 days in leap year");
            }
            if (!isLeapYear && day > 28) {
                throw new InvalidDateException("Invalid day. February can have maximum 28 days in non-leap year");
            }
        }
    }

    public void displayDate() {
        System.out.printf("Date: %02d/%02d/%04d\n", day, month, year);
    }

    public static void main(String[] args) {
        a3b2 date = new a3b2();
        
        try {
            date.acceptDate();
            System.out.println("\nValid date entered!");
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input format");
        }
    }
}