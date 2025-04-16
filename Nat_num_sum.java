// wap to find addition of ten natural numbers

public class Nat_num_sum{

	public static void main(String[] args){
		
		int sum = 0;
		
		// logic for adding 10 numbers
		for(int i = 1 ; i <= 10 ; i++){
			sum += i;
		}
		
		// printing result
		System.out.println("addition of first 10 natural numbers is : " + sum);
	}

}
