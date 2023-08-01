
import java.util.Locale;
import java.util.Scanner;

public class lista02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

//		Double n1 = 0.0;
//
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Digite um numero e vou te informar se é positivo ou negativo");
//
//		n1 = sc.nextDouble();
//
//		if (n1 < 0) {
//			System.out.printf("O numero %.2f é negativo", n1);
//
//		}
//
//		else {
//			System.out.printf("O numero %.2f é positivo", n1);
//		}

		
		

//		Double n2 = 0.0,n3 = 0.0;
//
//
//		System.out.println("Digite um numero e vou te informar se é positivo ou negativo");
//
//		n3 = sc.nextDouble();
//
//		n2 = n3;
//		
//		n3 %= 2;
//		
//		if (n3 == 0) {
//			System.out.printf("O numero %.2f é par", n2);
//
//		}
//
//		else {
//			System.out.printf("O numero %.2f é impar", n2);
//		}

		System.out.println("Digite o horario que comecou a jogar e o horario que terminou tendo uma duracao maximo de 21h");
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
