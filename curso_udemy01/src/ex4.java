
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String frase_01, frase_02, frase_03;
		int n1=1;

		System.out.printf("Digite a frase 0%d: \n", n1);
		frase_01 = sc.nextLine();
		
		
		n1 += 1;

		
		System.out.printf("Digite a frase 0%d: \n", n1);
		frase_02 = sc.nextLine();
		
		
		n1 =n1 + 1;
		
		System.out.printf("Digite a frase 0%d: \n", n1);
		frase_03 = sc.nextLine();
		
		
		n1 =n1 + 1;
		
		
		System.out.println(frase_01);
		System.out.println(frase_02);
		System.out.println(frase_03);
		sc.close();

		
		
		
		
		
		
	}

}
