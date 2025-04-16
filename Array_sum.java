// WAP in java to print the sum of elements of the array. Also display display array elements in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class Array_sum{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements you want in array : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter " + n + "number of elements");
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++){
			arr[i] = scanner.nextInt();
			sum += arr[i];			
		}
				 
				 
		Arrays.sort(arr);
		
		System.out.println("Sum of elements you entered is : " + sum);
		System.out.println("Sorted array you entered is : " + Arrays.toString(arr));
		
		scanner.close();
	}

}
