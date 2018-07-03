import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public void header() {
		//Prints the header on using the program
		System.out.println(String.format("%50s", " ").replaceAll(" ", "="));
		System.out.println("PI TO NTH");
		System.out.println(String.format("%50s", " ").replaceAll(" ", "="));
	}
	
	public int getUserInput() {
		//Prompts the user to enter a value n
		
		int n;
		
		System.out.println("Please enter a value to round off the value of pi");
		System.out.print("> ");
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		return n;
	}
	
	public double roundOff(double number, int roundOffValue) {
		//Rounds off a given number to roundOffValue-places
		
		double finalValue;
		
		BigDecimal bd = new BigDecimal(Double.toString(number)); //Convert double to ensure accuracy of value
		bd = bd.setScale(roundOffValue, RoundingMode.HALF_UP);
		finalValue = bd.doubleValue();
		
		return finalValue;
	}
	
	public static void main(String[] args) {
		Main test = new Main();
		Pi pi = new Pi();
		test.header();
		int places = test.getUserInput();
		
		System.out.println(String.format("%50s", " ").replaceAll(" ", "-"));
		double rounded = test.roundOff(pi.getPI(), places);
		System.out.println("The value of pi when rounded off to " + places + " places is");
		System.out.println(rounded);
		System.out.print(String.format("%24s", " ").replaceAll(" ", "-"));
		System.out.print("end");
		System.out.println(String.format("%23s", " ").replaceAll(" ", "-"));

	}
}
