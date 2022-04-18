package tn.esps.exercice8;

import java.util.Scanner;

public class TestExercice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.next();
		System.out.println(input);
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(reverse);
		scanner.close();

	}
}
