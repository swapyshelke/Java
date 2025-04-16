import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculate area of rectangle
        double rectangleArea = length * width;
        System.out.println("Area of the rectangle: " + rectangleArea);

        // For Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        // Calculate area of triangle
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);

        sc.close();
    }
}


// Enter the length of the rectangle: 5
// Enter the width of the rectangle: 3
// Area of the rectangle: 15.0

// Enter the base of the triangle: 4
// Enter the height of the triangle: 6
// Area of the triangle: 12.0