
import java.util.Scanner;

public class lista01 {

	public static void main(String[] args) {

		// Ex 01

		int n1 = 0, n2 = 0, n3 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor para ser somado ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor para ser somado ");
		n2 = sc.nextInt();

		n3 = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + n3);

		//Ex 02

		double raio01 = 0, raio02 = 0, area = 0;
		double pi = 3.14159;

		System.out.println("Digite o valor do raio para eu calcular a aréa");

		raio01 = sc.nextDouble();

		raio02 = Math.pow(raio01, 2);

		area = raio02 * pi;

		System.out.printf("%.4f", area);
		
		//Ex 03
		
		int a,b,c,d,diferenca;
		
		System.out.println("Digite o valor de 'A'");
		a = sc.nextInt();
		System.out.println("Digite o valor de 'B'");
		b = sc.nextInt();
		System.out.println("Digite o valor de 'C'");
		c = sc.nextInt();
		System.out.println("Digite o valor de 'D'");
		d = sc.nextInt();
		
		diferenca = ((a*b) - (c-d)); 

		System.out.println("Diferença: "+ diferenca);
		
		//Ex 04
		
		int numeroFuncionario,horasTrabalhadas;
		double pagamento_Por_Hora,salario;
		
		System.out.println("Digite seu numero");
		numeroFuncionario = sc.nextInt();

		System.out.println("Digite seu numero de horas trabalhadas");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite quanto voce recebe por hora");
		pagamento_Por_Hora = sc.nextDouble();
		
		salario = (pagamento_Por_Hora * horasTrabalhadas);
		
		System.out.printf("o valor do seu salario é:R$ %.2f",salario);
		
		//Ex 05
		
		int peca_01,quantidade_01;
		int peca_02,quantidade_02;
		
		double valor_01,valorTotal_01;
		double valor_02,valorTotal_02;
		
		System.out.println("Digite o código,a quantidade de peças e o valor unitario do 1 item");
		peca_01 = sc.nextInt();
		quantidade_01 = sc.nextInt();
		valor_01 = sc.nextDouble();
		
		valorTotal_01 = quantidade_01 * valor_01;
		
		System.out.println("Digite o código,a quantidade de peças e o valor unitario do 2 item");
		peca_02 = sc.nextInt();
		quantidade_02 = sc.nextInt();
		valor_02 = sc.nextDouble();
		
		valorTotal_02 = quantidade_02 * valor_02;
		
		System.out.printf("Valor a pagar: R$ %.2f\n", valorTotal_01);
		System.out.printf("Valor a pagar: R$ %.2f\n", valorTotal_02);
		
		sc.close();

	}

}
