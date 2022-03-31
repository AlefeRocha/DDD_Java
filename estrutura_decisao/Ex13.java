package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();	

		if ( a > b && a > c)
			System.out.printf("A é o maior!");
		else if ( b > a && b > c) 
			System.out.printf("B é o maior!");
		else 
			System.out.printf("C é o maior!");
	}
}
