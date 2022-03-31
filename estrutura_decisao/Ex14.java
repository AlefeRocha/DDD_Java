package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, resultado;
		
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura: ");
		altura = ler.nextDouble();
		
		resultado = peso / (altura * altura);
				
		if ( resultado >= 18.5 && resultado <= 24.9)
			System.out.printf("Você está no peso ideal!");
	}
}
