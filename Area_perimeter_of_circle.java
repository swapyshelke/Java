import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Constants
        final double PI = 3.14159;

        // Calculate area and perimeter (circumference)
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);

        sc.close();
    }
}

/*

🧪 Sample Output:


Enter the radius of the circle: 5
Area of the circle: 78.53975
Perimeter (Circumference) of the circle: 31.4159

*/