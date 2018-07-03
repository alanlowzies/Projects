package fibonacci_sequence;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	private int getNumber() {
		//Gets the user input of an integer 'n'
		//This integer will be used as a marker to generate the sequence up to 'n'.
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		//Check if number input is greater than 2
		if(n <= 2) {
			System.out.print("Greater than 2, please > ");
			getNumber();
		}
		
		return n;
	}
	
	private ArrayList<Integer> generateFibonacciSeq(int num) {
		ArrayList<Integer> fibSeq = new ArrayList<Integer>();
		fibSeq.add(0);
		fibSeq.add(1);
		
		for(int i = 0; i < num-2; i++) {
			int newNum = fibSeq.get(i) + fibSeq.get(i+1);
			fibSeq.add(newNum);
		}
		
		return fibSeq;
	}
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		System.out.print("Enter a number greater than 2 > ");
		int number = fib.getNumber();
		System.out.println(" ");
		System.out.println("Ta-da... Fibonacci Sequence~");
		System.out.println(" ");
		
		ArrayList<Integer> seq = fib.generateFibonacciSeq(number);
		
		for (Integer integer : seq) {
			System.out.println(integer);
		}
	}
}
