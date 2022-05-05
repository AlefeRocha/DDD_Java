package Ex34;

import java.util.Scanner;

public class Ex34_Cadastro {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Ex34_Cliente[] listaClientes = new Ex34_Cliente[2];
		
		int id, idade;
		String nome, email;
		char possuiConta, atualizaEmail;
		Ex34_ContaBancaria conta;

		for(int i = 0; i < listaClientes.length; i++) {			
			System.out.println("Digite o ID: ");
			id = ler.nextInt();
			
			System.out.println("Digite o Nome: ");
			nome = ler.next();
		
			System.out.println("Digite a Idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite o Email: ");
			email = ler.next();
		
			System.out.println("Já possui um conta bancária(S/N)? ");
			possuiConta = ler.next().toUpperCase().charAt(0);
		
			
			if(possuiConta == 'S'){
				Ex34_ContaBancaria temConta = new Ex34_ContaBancaria();
				
				System.out.println("Digite a Agência: ");
				temConta.agencia = ler.next();
			
				System.out.println("Digite o Número: ");
				temConta.numero = ler.next();
			
				System.out.println("Digite seu Saldo: ");
				temConta.saldo = ler.nextDouble();
				
				
				conta = temConta;
	
			} else {
				conta = null;
			}
				
			Ex34_Cliente c = new Ex34_Cliente(id, nome, idade, email, conta);
			listaClientes[i] = c;
			
			}
			
		for(int i = 0; i < listaClientes.length; i++){
			System.out.printf("\n %s ", listaClientes[i].exibirNomeIdade());
			System.out.printf("\n %s ", listaClientes[i].exibirDadosConta());
			System.out.println("\nDeseja atualizar o email(S/N)? ");
			atualizaEmail = ler.next().toUpperCase().charAt(0);
			
			if(atualizaEmail == 'S'){
				System.out.println("Digite o email do cliente");
				email = ler.next();
				listaClientes[i].atualizarEmail(email);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s", listaClientes[i].email);
			}
		}
		
		ler.close();
		
	}
}
