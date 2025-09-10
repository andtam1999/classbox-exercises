package day2;

import java.util.Scanner;

public class Fibonacci {
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < num; i++) {
			System.out.println(fib(i));
		}
	}
}
