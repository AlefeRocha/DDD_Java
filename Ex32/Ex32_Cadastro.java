package Ex32;

import java.util.Scanner;

public class Ex32_Cadastro {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex32_Cliente[] listaClientes = new Ex32_Cliente[5];
		
		for(int i = 0; i < listaClientes.length; i++){
			Ex32_Cliente c = new Ex32_Cliente();
			
			System.out.println("Digite o ID: ");
			c.id = ler.nextInt();
			
			System.out.println("Digite o Nome: ");
			c.nome = ler.next();
			
			System.out.println("Digite a Idade: ");
			c.idade = ler.nextInt();
			
			System.out.println("Digite o Email: ");
			c.email = ler.next();
			
			listaClientes[i] = c;
			
		}
		
		for(int i = 0; i < listaClientes.length; i++) {
			if(listaClientes[i].idade >= 18) {
				System.out.println("Cliente - Id: " + listaClientes[i].id + ", Nome: " + listaClientes[i].nome + ", Idade: " + listaClientes[i].idade + " e Email: " + listaClientes[i].email);
			}
		}
		
		ler.close();
		
	}
}