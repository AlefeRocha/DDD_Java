package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolar, reais;
		
		System.out.printf("Digite a cota��o do d�lar hoje: ");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite o valor em dolar: ");
		dolar = ler.nextDouble();
		
		reais = cotacao * dolar;
		
		System.out.printf("O valor em reais �: %.2f", reais);
		
	}

}
