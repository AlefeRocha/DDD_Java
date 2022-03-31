package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2;
		
		System.out.printf("Digite um valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		if (v1 < v2) {
			System.out.printf("O primeiro valor é o menor!");
		}else {
			System.out.printf("O segundo valor é o menor!");
		}
	}
}
