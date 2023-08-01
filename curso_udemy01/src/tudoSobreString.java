
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class tudoSobreString {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);


		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase(); 	//tudo em Minusculo = abcde fghij abc abc defg
		String s02 = original.toUpperCase(); 	//tudo em Maiusculo = ABCDE FGHIJ ABC ABC DEFG
		String s03 = original.trim();   		//tira os espaços nos cantos da string
		String s04 = original.substring(2);		// pega apartir da posição indicada(2) em diante mantendo a formatação = cde FGHIJ ABC abc DEFG
		String s05 = original.substring(2,9);	//vai recortar apartir do indicado(2) até o outro indicado (9) = cde FGH
		String s06 = original.replace('a', 'x');// Sempre que achar o  condição indicada ('a') é para trocar por ('x') diacordo com a indicação = xbcde FGHIJ ABC xbc DEFG	
		String s07 = original.replace("abc", "xy");// tambem funciona com substrings  
		
		//abcde FGHIJ ABC abc DEFG
		//0123456789...etc
		int o = original.indexOf("bc");	// vai pegar a primeira ocorrencia de (bc) = 1
		int j = original.lastIndexOf("bc"); // vai pegar a ultima ocorrencia de (bc) = 17
				
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(o);
		System.out.println(j);
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		int i = 0;
		
		for(i = 0 ; i <vect.length ; i++){
		System.out.println(vect[i]);
		}
		
		
		sc.close();

	}

}
