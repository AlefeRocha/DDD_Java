package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado, area;
		
		System.out.printf("Digite o valor de um dos lados: ");
		lado = ler.nextDouble();
		
		area = lado * lado;
		
		System.out.printf("O valor da �rea do quadrado �: %.2f", area);
		
	}

}
