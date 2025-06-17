// WAP recursively in Java to calculate the sum of all numbers from 1 to n

import java.util.Scanner;
class RecursiveSum {
    public static int calcSum(int n){
        if(n == 0) {
            return 0;
        }

        return n + calcSum(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int number = sc.nextInt();
        int sum = calcSum(number);
        System.err.println("sum of no's from 1 to " + number + "is " + sum);
    }
}