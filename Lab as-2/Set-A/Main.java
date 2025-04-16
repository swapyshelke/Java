import series.Fibonachi;
import series.Cube;
import series.Square;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();
        sc.close();

        Fibonachi fib = new Fibonachi();
        Cube cube = new Cube();
        Square square = new Square();

        fib.printSeries(n);
        cube.printSeries(n);
        square.printSeries(n);
    }
}