// WA{ in java to display triangle of * using nested for loop
// *
// * * 
// * * * 

public class StarTriangle {
    public static void main(String[] args) {
        int rows = 3; // You can change this number to make a bigger triangle

        for (int i = 1; i <= rows; i++) { // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for printing *
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
