package estrutura_de_repeticao;

public class Ex28 {

	public static void main(String[] args) {
			
		int soma = 0;
		int num = 1;
  
		do {
			soma = soma + num;
			num++;				
		}
		while (num <= 100);
		System.out.printf("A soma dos resultado é %d!", soma);
		
    }
}