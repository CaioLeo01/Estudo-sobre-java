

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		String f;
		char x;
		int v;
		double l;
		
		
		System.out.println("Digite uma letra \n");
		x = sc.next().charAt(0);
		System.out.println("Voce digitou a letra:" + x + "\n");
		
		System.out.println("Digite um numero inteiro: \n");
		v = sc.nextInt();
		System.out.println("Voce digitou o numero inteiro: " + v);
		
		System.out.println("Digite uma frase: \n");
		f = sc.next();
		System.out.println("Voce digitou a frase: " + f);
		
		System.out.println("Digite um numero decimal com virgula: \n");
		l = sc.nextDouble();
		System.out.println("Voce digitou o numero decimal: " + l);
		
		
		
		x = sc.next().charAt(0);
		v = sc.nextInt();
		f = sc.next();
		l = sc.nextDouble();
		
		System.out.println("Dados inseridos:");
		System.out.println(x);
		System.out.println(v);
		System.out.println(f);
		System.out.println(l);
		
		sc.close();
		
		/*
		
		sysout e apertar Ctrl + espaço ele faz o comando println
		
		
		inteiro
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		System.out.printf("Voce digitou: %d ",x);
		
		
		sc.close();
		
		*/
/*
		
		double
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %f ",x);
		
		
		sc.close();
		
		*/
		
		
		/*
				
				Char
				
				Scanner sc = new Scanner(System.in);
				
				char x;
				x = sc.next(). charAt(0);
				System.out.println("Voce digitou: " + x);
				
				
				sc.close();
				
				*/
		
		
				/*
		
					String
					
					Scanner sc = new Scanner(System.in);
					
					string x;
					x = sc.nex();
					System.out.println("Voce digitou: " + x);
					
					
					sc.close();
					
					*/
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
