package series;

public class Cube {
    public void printSeries(int n) {
        System.out.println("cube of numbers : ");
        for(int i = 1 ; i <= n ; i++) {
            System.out.print((i * i  *i) + " ");
        }

        System.out.println();
    }
}