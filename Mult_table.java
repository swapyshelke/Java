// wap in java to accept a number from command prompt and generate a multiplication table of a number.
// accept number using bufferReader class

import java.util.Scanner;

public class Mult_table {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to generate multiplication table : ");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= 10 ; i++){
		
			System.out.println(num * i);
		
		}
	}

}
