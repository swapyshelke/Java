// WAP in Java to calculate recursive method to calculate the factorial of a given
// positive integer

class RecursiveFactorial{
    public static int calculateFactorial(int n) {
        if(n == 0) {
            return 1;
        }

        return n * calculateFactorial( n - 1 );
    }

    public static void main(String[] args) {
        int number = 7;

        int factorial = calculateFactorial(number);
        System.out.println("factorial of " + number + "is " + factorial);

        number = 4;
        factorial = calculateFactorial(number);
        System.out.println("\n factorial of " + number + "is : " + factorial);
    }
}