package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;
		
		System.out.printf("Digite um valor positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("Erro. Digite um valor positivo: ");
			num = ler.nextInt();
		}
				
		for(int i = 1; i <= 10; i++) {
			System.out.printf("\n %d x %d = %d", num, i, i * num);	
		}
		
		ler.close();
		
	}
}