package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		int i = 1;
		int numA = 2;
		int numB = 3;
		
		System.out.printf("Digite um valor positivo(menor que 100): ");
		num = ler.nextInt();
		
		while(num < 0) {
			System.out.printf("Valor inválido, digite novamente: ");
			num = ler.nextInt();
		}
		
		while(i <= num) {
				System.out.println(numA);
				numA = numA + numB;
				numB = numB + 2;
				i++;
		}
		
		ler.close();

	}
}