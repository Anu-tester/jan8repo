package javainterviewquestions;

import java.util.HashSet;
import java.util.Set;

public class missinfnumberinarray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int k = 1; k <= 9; k++) {
			sum1 = sum1 + k;
		}
		System.out.println(sum1);
		System.out.println("Missing Number =" + (sum1 - sum));

		// duplicate string in an array

		String names[] = { "java", "python", "Ruby", "C#", "Java Script", "PHP", "Perl", "java", "C#" };

		int arsize = names.length;

		for (int ac = 0; ac < arsize; ac++) {
			for (int b = ac + 1; b < arsize; b++) {
				if (names[ac].equals(names[b])) {
					System.out.println("duplicate string =  " + names[ac]);
				}
			}
		}
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate string =  " + name);
			}
		}

	}

}
