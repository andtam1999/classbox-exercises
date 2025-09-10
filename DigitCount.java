package day2;

import java.util.Scanner;

public class DigitCount {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println(Integer.toString(num).length() + " digits");
	}
}
