package tn.esps.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();// ou new Vector<>(); --> thread-safe
		list.add("Maazoun");
		list.add("Yessine");
		list.add("Rania");
		list.add(0, "Drira");
		System.out.println("**************jdk1************");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + "\t");
		}
		System.out.println("\n**************jdk1.5 enhanced for loop************");
		for (String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println("\n**************jdk1.8 lambda************");
		list.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		System.out.println(list.remove(1));
		if (list != null && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "\t");
			}
		}

	}
}
