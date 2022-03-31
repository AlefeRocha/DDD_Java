package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite o valor da nota P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor da nota P2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + 2 * p2) / 3;
		
		if ( media >= 5 ) {
			System.out.printf("Aprovado, sua média foi de %.1f.", media);
		} else {
			System.out.printf("Você foi reprovado, sua média foi de %.1f.", media);
		}
	}
}
