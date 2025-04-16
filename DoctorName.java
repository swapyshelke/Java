import java.util.Scanner;

class InvalidNameException extends Exception {
    // what is inside Exception class
    // what is extends
  public InvalidNameException(String message) {
    // what are we receiving inside "message" 
      super(message);
      // what is super method
      // what is use of it
      // how to use it
  }
}

public class DoctorName {
  public static void validateDoctorName(String name) throws InvalidNameException {
    // wtat is 'throws'
      if (!name.matches("^[a-zA-Z\\s]+$")) {
        // what is matches() function
        // how to remember this regular expression
          throw new InvalidNameException("Name is Invalid - Only letters and spaces are allowed");
          // what is 'throw' keyword
      }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Doctor's Name: ");
      String doctorName = sc.nextLine();
      
      try {
          validateDoctorName(doctorName);
          System.out.println("Doctor's Name is Valid: " + doctorName);
      } catch (InvalidNameException e) {
          System.out.println("Error: " + e.getMessage());
      } finally {
          sc.close();
      }

      // how try, catch finally works
  }
}