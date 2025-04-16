// WAP in java program to read the ages all members of a family store them in one 
// dimensional array and display the age of the eldest and the youngest persons.


import java.util.Scanner;

public class Family{


public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter no of family members you have : ");
	
	int n = scanner.nextInt();	
	int[] ages = new int[n];
	

	
	System.out.println("enter ages of " + n + "family members.");
	
	for(int i = 0 ; i < n ; i++){
		
		ages[i] = scanner.nextInt();
	
	}
	
	int eldest = ages[0], youngest = ages[0];
	
	for (int i = 1 ; i < n ; i++){
	
		if(ages[i] > eldest){
		
			eldest = ages[i];
		
		}
		
		if(ages[i] < youngest){
		
			youngest = ages[i];
		
		}
	
	}
	
	System.out.println("Eldest : " + eldest);
	System.out.println("Youngest : " + youngest);

}


}
