package Ex35;

import java.util.Scanner;

public class Ex35_Projeto {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Ex35_Cliente[] listaCliente = new Ex35_Cliente[5];
		
		int id;
		String nome, email, agencia, numero, AtualizarEmail, novoEmail;
		char possuiConta;
		int idade;
		double saldo;
		Ex35_Conta conta;
		
		for (int i = 0 ; i<5 ; i++) {
			Ex35_Cliente c = new Ex35_Cliente();
			
			System.out.println("Digite o seu id: ");
			id = ler.nextInt();
			c.setId(id);
			
			System.out.println("Digite o seu nome: ");
			nome = ler.next();
			c.setNome(nome);
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			c.setIdade(idade);
			
			System.out.println("Digite o seu email:");
			email = ler.next();
			c.setEmail(email);
			
			System.out.println("Possui conta bancária (S/N): ");
			possuiConta = ler.next().toUpperCase().charAt(0);
			
			if (possuiConta == 'S') {
				Ex35_Conta ct = new Ex35_Conta();
							
				System.out.printf("Digite sua agência: ");
				agencia = ler.next();
				ct.setAgencia(agencia);
				System.out.printf("Digite o número da conta: ");
				numero = ler.next();
				ct.setNumero(numero);
				System.out.printf("Digite o seu saldo: ");
				saldo = ler.nextDouble();
				ct.setSaldo(saldo);
				
				c.setContaBancaria(ct);
				
			}else {	
				conta = null;	
			}
			
	
			listaCliente[i] = c;
			
			
		}
		for (int i = 0 ; i< 5 ; i++) {
			
			
			System.out.println("\nDeseja atualizar seu email (S/N)? ");
			AtualizarEmail = ler.next().toUpperCase();
			
			if(AtualizarEmail.equals("S")) {
				System.out.println("Digite o novo email do cliente: ");
				novoEmail = ler.next();

				listaCliente[i].setAtualizarEmail(novoEmail);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s", listaCliente[i].getEmail());
			}
			System.out.printf("\n %s", listaCliente[i].getExibirNomeIdade());
			System.out.printf("\n %s", listaCliente[i].getExibirDadosConta());
			
		}
		
		ler.close();
	}

}