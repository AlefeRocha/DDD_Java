package estrutura_de_repeticao;

public class Ex30 {

	public static void main(String[] args) {
			
		int numA = 1;
		int numB = 1;
		int numC = 1;
		
        for(int i = 0; i < 19; i++){
        	System.out.println(numA);
        	int num = numA + numB + numC;
        	numA = numB;
        	numB = numC;
        	numC = num;
        }
    } 
}