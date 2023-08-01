

import java.util.Locale;

public class Main {


	public static void main(String[] args) {

		
		String nome = "Maria Boto Rosa";
		int y= 10, idade=22;
		double x = 2.201029, renda= 20000.00 ;
		
		System.out.print("olá mundo!");
		System.out.println("ola mundo" );
		System.out.printf("%d \n%n", y);
		System.out.printf("%.4f%n%n", x);
	//	Troca o separarador padrão para o dos EUA que é o ponto ao ínves de virgula
		
		 //Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		
		//System.out.println("ola mundo 2");o "ln" da uma quebra de linha no final 
		// "%n ou \n" é o quebra de linha 
		
		//para concatenar vários elementos em um mesmo comando de escrita em println
		System.out.println("resultado = " + x + " Metros\n\n" );
		//para concatenar vários elementos em um mesmo comando de escrita em printf
		System.out.printf("valor de y = %d valor de x = %.2f \n\n", y, x);
		
		/* %f= ponto flutuante
		 * %d= inteiro
		 * %s=texto/string
		 * %n ou \n= quebra de linha
		 */
		
		System.out.printf("%s tem %d e ganha R$%.2f\n\n ", nome, idade, renda);
		
									// Exercício 01 de fixação
		
	//	Locale localeBrasileiro = new Locale("pt", "BR");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code= 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567 ;
		
		
		System.out.printf("Products\n");
		System.out.printf("%s , which price is $ %.2f\n", product1, price1 );
		System.out.printf("%s , which price is $ %.2f\n\n", product2, price2 );
		
		System.out.printf("Record: %d years old, code %d and gender: %c\n\n",age, code, gender );
		
		System.out.printf("Measue with eight decimal places: %.8f\n", measure );
		System.out.printf("Rouded (three decimal places): %.3f\n", measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure );							
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
