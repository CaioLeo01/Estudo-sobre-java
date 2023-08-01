
import java.util.Scanner;

public class condição {

	public static void main(String[] args) {

		int n1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bom dia usuario");
		System.out.println("Digite um numero de 0 a 10");
		n1 = sc.nextInt();

		/*
		 * endentação quando facilitamos a legibilidade do seu código,podemos observar
		 * isso no exemplo abaixo do println
		 * 
		 * if (n1 == 1) { System.out.println("N1=0"); }
		 * 
		 */

		if (n1 == 1) {
			System.out.println("N1=0");
		} else if (n1 == 1) {
			System.out.println("N1=1");
		} else if (n1 == 2) {
			System.out.println("N1=2");
		} else if (n1 == 3) {
			System.out.println("N1=3");
		} else if (n1 == 4) {
			System.out.println("N1=4");
		} else if (n1 == 5) {
			System.out.println("N1=5");
		} else if (n1 == 6) {
			System.out.println("N1=6");
		}

		else {

			System.out.println("não entrou na condição de if");

		}

		
		
		//Expresão condicional ternária
		
		double teste01 = 34.5;
		double teste02 = (teste01 < 20.0) ? teste01 * 0.1 : teste01 * 0.05;
		
	   
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
