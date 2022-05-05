package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1;
		
		System.out.printf("Digite um valor: ");
		v1 = ler.nextInt();
		
		while(v1 <= 0) {
			System.out.printf("Erro. Digite um valor positivo:");
			v1 = ler.nextInt();
		}
		
		System.out.printf("Fim");
		ler.close();
	}
}