package next_prime_number;

import java.util.Scanner;

public class NextPrimeNumber {
	private int lastPrimeNumber;
	
	private boolean toContinue() {
		Scanner input = new Scanner(System.in);
		System.out.println("Continue? Enter 'y' to continue or any other key to exit");
		System.out.print("> ");
		String response = input.nextLine().toLowerCase();
		
		if(response.equals("y") || response.equals("yes")) {
			return true;
		}
		
		//If response is no
		return false;
	}
	
	private int generateNextPrimeNumber(int startingNum) {
		int num = startingNum + 1;
		
		if(isPrime(num)) {
			this.lastPrimeNumber = num;
		}
		else {
			generateNextPrimeNumber(num);
		}
		
		return this.lastPrimeNumber;
	}
	
	private boolean isPrime(int num) {
		int counter = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				counter++;
			}
		}
		
		if(counter != 2) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		NextPrimeNumber npn = new NextPrimeNumber();
		
		System.out.println("Printing out prime numbers...");
		System.out.println(2);
		
		npn.lastPrimeNumber = 2;
		
		while(npn.toContinue()) {
			System.out.println(npn.generateNextPrimeNumber(npn.lastPrimeNumber));
		}
		
		System.out.println("Goodbye!");
	}
}
