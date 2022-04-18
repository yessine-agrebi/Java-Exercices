package tn.esps.exercice2;

import java.util.Scanner;

public class TestExercice2 {
	public static void main(String[] args) {
		int inconnu = (int) (Math.random() * 100);
		System.out.println(inconnu);
		int valeur;
		int score = 0;
		System.out.println("Enter un entier entre 0 et 100");
		Scanner scanner = new Scanner(System.in);
		do {
			valeur = scanner.nextInt();
			// System.out.println("value " + valeur);
			if (valeur > inconnu) {
				System.out.println("Plus Grand!");
				score++;
			} else if (valeur < inconnu) {
				System.out.println("Plus Petit!");
				score++;
			} else {
				score++;
				System.out.println("Vous avez gagné!");
				System.out.println("Votre score est : " + score);
			}
		} while (inconnu != valeur);
		scanner.close();
	}
}
