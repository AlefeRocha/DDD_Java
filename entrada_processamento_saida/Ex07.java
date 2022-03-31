package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3, valor4, valor5, pagamento, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		valor3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		valor4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		valor5 = ler.nextDouble();
		
		System.out.printf("Digite o valor pago em dinheiro: ");
		pagamento = ler.nextDouble();
		
		troco = pagamento - (valor1 + valor2 + valor3 + valor4 + valor5);
		
		System.out.printf("O troco será de: %.2f", troco);
		
	}

}
