package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3, resultado;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextDouble();
		
		if ( (v1 + v2) > v3 && (v1 + v3) > v2 && (v2 + v3) > v1 )	
			if ( v1 != v2 && v1 != v3)
				System.out.printf("� um tri�ngulo escaleno!");
			else if ( v1 == v2 && v1 == v3 && v2 == v3)
				System.out.printf("� um tri�ngulo equil�tero!");
			else
				System.out.printf("� um trin�ngulo is�celes!");
		else {
			System.out.printf("N�o � um tri�ngulo!");
		}
	}
}
