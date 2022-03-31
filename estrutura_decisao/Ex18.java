package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, vfinal;
		
		System.out.printf("Digite a acelaração: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite velocidade inicial: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Digite o tempo de percurso: ");
		t = ler.nextDouble();
		
		vfinal = (v0 + ( a * t )) * 3.6;
		
		if ( vfinal <= 40 ) {
			System.out.printf("Veículo muito lento!");
	} 	else if ( vfinal <= 60 ) {
			System.out.printf("Velocidade permitida!");
	}	else if ( vfinal <= 80 ) {
			System.out.printf("Velocidade de cruzeiro!");
	}	else if ( vfinal <= 120 ) {
			System.out.printf("Veículo rápido!");
	} 	else {
			System.out.printf("Veículo muito rápido!");
	}
		
	}
}
