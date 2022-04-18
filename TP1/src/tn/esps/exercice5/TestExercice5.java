package tn.esps.exercice5;

import java.util.Scanner;

public class TestExercice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrer un entier");
		int entier = scanner.nextInt();
		String binary = Integer.toBinaryString(entier);
		String octal = Integer.toOctalString(entier);
		String hexa = Integer.toHexString(entier);
		System.out.println(entier + " = " + binary + " en binaire");
		System.out.println(entier + " = " + octal + " en Octal");
		System.out.println(entier + " = " + hexa + " en hexadecimal");
		scanner.close();
	}
}
