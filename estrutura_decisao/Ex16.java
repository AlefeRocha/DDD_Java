package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double hip, cat1, cat2;
		
		System.out.printf("Digite o primeiro valor: ");
		hip = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		cat1 = ler.nextDouble();

		System.out.printf("Digite o terceiro valor: ");
		cat2 = ler.nextDouble();
		
		
		if ( (hip * hip) == (( cat1 * cat1 ) + ( cat2 * cat2 )) )
			System.out.printf("É um triângulo retângulo!");
		else
			System.out.printf("Não é um triângulo retângulo!");
	}
}
