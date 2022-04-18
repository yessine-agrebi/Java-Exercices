package tn.esps.exercice9;

public class TestExercice9 {
	public static void main(String[] args) {
		int count = 0;
		char lettre = 'a';
		char[] arr = {'a', 'b', 'c', 'a', 'c'};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == lettre) {
				count++;
			}
		}
		System.out.println(count);
	}
}
