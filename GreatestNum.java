// WAP to find greatest number among three


import java.util.Scanner; 

public class GreatestNum{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        
        // input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        
        // logic for greatest number
        
        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        
        System.out.println("The greatest number is : " + greatest);
        
        scanner.close(); 
}

}
