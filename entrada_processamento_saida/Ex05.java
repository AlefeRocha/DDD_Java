package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorC, valorF;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		valorC = ler.nextDouble();
		
		valorF = (valorC * 9 / 5) + 32;
		
		System.out.printf("O valor em Fahrenheit é: %.1f", valorF);

	}

}
