package prime_factorisation;

import java.util.Scanner;

public class PrimeFactorisation {
	public int getUserNumber() {
		Scanner numberInput = new Scanner(System.in);
		int userNumber = numberInput.nextInt();
		
		return userNumber;
	}
	
	public boolean isPrimeNumber(int num) {
		//Check if value is 0 or 1 (or negative values)
		if(num < 1) {
			return false;
		}
		
		//Get the number of divisors that can be divided by the dividend (num)
		int counter = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				counter++;
			}
		}
				
		//Check if the counter value is two (meaning the number can only be divided by 1 and itself)
		if(counter != 2) {
			return false;
		}
		
		//Number is a prime number if it passes the above validations
		return true;
	}
	
	public static void main(String[] args) {
		PrimeFactorisation pf = new PrimeFactorisation();
		System.out.print("Enter a number > ");
		int userNumber = pf.getUserNumber();
		
		System.out.println(String.format("%50s", " ").replaceAll(" ", "-"));
		
		pf.isPrimeNumber(userNumber);
		
		//Check if number is prime
		if(pf.isPrimeNumber(userNumber)) {
			System.out.println(userNumber + " is a prime number.");
		}
		else {
			System.out.println(userNumber + " is not a prime number");
		}
	}
}
