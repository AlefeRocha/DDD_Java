package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite o valor da base do ret�ngulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura do ret�ngulo: ");
		altura = ler.nextDouble();
		
		area = base * altura;
				
		if (area > 100) {
			System.out.printf("� um terreno grande!");
		} else {
			System.out.printf("� um terreno pequeno!");
		}
	}
}