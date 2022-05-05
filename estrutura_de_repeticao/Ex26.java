package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x, numA, numB;
		
	
		System.out.printf("Digite um valor qualquer: ");
		x = ler.nextInt();
		
		
		while(x <= 0) {
			System.out.printf("Erro. Digite qualquer valor positivo: ");
			x = ler.nextInt();
		}
		
		
		System.out.printf("Digite um valor para o intervalo de cálculo: ");
		numA = ler.nextInt();
		
		System.out.printf("Digite outro valor para o intervalo de cálculo: ");
		numB = ler.nextInt();
		
		
		while(numA >= numB) {
			System.out.printf("Erro. Digite um valor de intervalo maior que o primeiro: ");
			numB = ler.nextInt();
		}
		
		while(numB >= numA) {
			System.out.printf("\n %d x %d = %d", x, numB, x * numB);
			numB--;
		}
		
		ler.close();
		
	}
}