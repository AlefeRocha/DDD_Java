package estrutura_de_repeticao;
	 
import java.util.Scanner;
	 
public class Ex23 {
	 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	       
	    char sexo;
	       
	    System.out.printf("Digite qual seu sexo: ");
	    sexo = ler.next().toUpperCase().charAt(0);
	       
	    while(sexo != 'F' && sexo != 'M') {
	    	System.out.printf("Erro! Digite novamente: ");
	    	sexo = ler.next().toUpperCase().charAt(0);
	    }
	    
	    if(sexo == 'M') {
	    	System.out.printf("Sexo Masculino confirmado!");
	    }else {
	    	System.out.printf("Sexo Feminino confirmado!");
	    }
	    	
		System.out.printf("Fim");
		ler.close();
	 }
}
