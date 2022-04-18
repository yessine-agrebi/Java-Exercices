package tn.esps.exercice6;

import java.util.Scanner;

public class TestExercice6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter une date:");
		String date = scanner.nextLine();
		String str = "";
		if (date.contains("/01/")) {
			str = date.replaceAll("/01/", " Janvier ");
		}
		if (date.contains("/02/")) {
			str = date.replaceAll("/02/", " Fevrier ");
		}
		if (date.contains("/03/")) {
			str = date.replaceAll("/03/", " Mars ");
		}
		if (date.contains("/04/")) {
			str = date.replaceAll("/04/", " Avril ");
		}
		if (date.contains("/05/")) {
			str = date.replaceAll("/05/", " Mai ");
		}
		if (date.contains("/06/")) {
			str = date.replaceAll("/06/", " Juin ");
		}
		if (date.contains("/07/")) {
			str = date.replaceAll("/07/", " Juillet ");
		}
		if (date.contains("/08/")) {
			str = date.replaceAll("/08/", " Aout ");
		}
		if (date.contains("/09/")) {
			str = date.replaceAll("/09/", " Septembre ");
		}
		if (date.contains("/10/")) {
			str = date.replaceAll("/10/", " Octobre ");
		}
		if (date.contains("/11/")) {
			str = date.replaceAll("/11/", " Novembre ");
		}
		if (date.contains("/12/")) {
			str = date.replaceAll("/12/", " Decembre ");
		}
		System.out.println(date);
		System.out.println(str);
		scanner.close();

	}
}
