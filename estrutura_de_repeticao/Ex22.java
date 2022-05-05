package estrutura_de_repeticao;
 
import java.util.Scanner;
 
public class Ex22 {
	
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int v1, v2;
       
        System.out.printf("Digite o primeiro valor: ");
        v1 = ler.nextInt();
       
        System.out.printf("Digite o segundo valor: ");
        v2 = ler.nextInt();
        
        while(v2 <= v1) {
            System.out.printf("Digite um valor maior que o primeiro: ");
            v2 = ler.nextInt();
        }
       
		System.out.printf("Fim");
		ler.close();
    }
}
