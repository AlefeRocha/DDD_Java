package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double base, altura, soma;

		System.out.printf("Digite o valor da base do tri�ngulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite agora o valor da altura do tri�ngulo: ");
		altura = ler.nextDouble();
		
		soma = base * altura / 2;
		
		System.out.printf("A �rea do tri�ngulo �: %.2f", soma);
		
	}
}
