package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int resultado;
			
		for (int numA = 1; numA <= 20; numA++) {
			
			for (int numB = 1; numB <= 10; numB++) {
				
				resultado = numA * numB;
				System.out.printf("\n %d X %d = %d",numA, numB, resultado);
		
			}
				System.out.printf("\n Aperte alguma tecla para continuar!");
				ler.nextLine();
		}
		
		ler.close();
		
	}
}