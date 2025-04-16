package series;

public class Fibonachi {
        public void printSeries(int n){
            int a = 0 , b = 1;
            System.out.println("Fibonachi Series: ");
            for(int i = 0 ; i < n ; i++) {
                System.out.println(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
}