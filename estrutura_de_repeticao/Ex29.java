package estrutura_de_repeticao;

public class Ex29 {

	public static void main(String[] args) {
			
		int numA = 1;
		int numB = 0;
        
		System.out.println(numB);
        System.out.println(numA);
		
        for(int i = 0; i < 29; i++){
            numA = numA + numB;
            numB = numA - numB;
            System.out.println(numA);
        }
    } 
}