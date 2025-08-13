import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fehrenite ");
		double fah = scanner.nextDouble();
		
		double celcius = (fah - 32)*5/9;
		
		System.out.print(celcius);
	}
}
