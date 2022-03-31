package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numA, numB, numC, numD, media;
		
		System.out.printf("Digite o primeiro valor: ");
		numA = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		numB = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		numC = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		numD = ler.nextDouble();
		
		media = (numA + numB + numC + numD) / 4;
				
		System.out.printf("A média aritmética é: %.2f", media);
	}
}
