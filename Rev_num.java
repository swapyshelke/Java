// WAP to reverse a number. Accept number using command line argument


public class Rev_num{

	public static void main(String[] args){
	
	
		if(args.length == 0){
			System.out.println("Please provide a number to command line .");
			return;
		}
	
		int num = Integer.parseInt(args[0]);
		
		int rev = 0;
		
		while(num != 0){
			int digit = num % 10;
			rev = rev * 10 + digit ;
			num /= 10;
		}
		
		
		System.out.println("Reversed number is : " + rev);
	
	}

} 





/*

public class Rev_num{

	public static void main(String[] args){
	
	
		if(args.length == 0){
			System.out.println("Please provide a number to command line .");
			return;
		}
	
		int num = Integer.parseInt(args[0]);
		
		int rev = 0;
		
		while(num != 0){
			int digit = num % 10;
			rev = rev * 10 + digit ;
			num /= 10;
		}
		
		
		System.out.println("Reversed number is : " + rev);
	
	}

} 


*/
