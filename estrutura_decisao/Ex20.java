package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Digite o valor da P1: ");
		p1 = ler.nextDouble();
		
		p2 = ( 15 - p1 ) / 2;
		
		System.out.printf("Você precisará tirar %.1f na P2 para passar na matéria!", p2);
	}
}

/* conta
media = ( p1 + 2*p2 ) / 3
5 = ( p1 + 2*p2 ) / 3
3 * 5 = p1 + 2*p2
15 = p1 + 2*p2
2*p2 = 15 - p1
p2 = ( 15 - p1 ) / 2
*/
