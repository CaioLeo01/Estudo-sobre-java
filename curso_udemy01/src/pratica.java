

import java.util.Locale;
import java.util.Scanner;



public class pratica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		int i = 0;

		for (i = 0; i <vect.length; i++) {
			System.out.println(vect[i]);
		}

		
		sc.close();

	}

}
