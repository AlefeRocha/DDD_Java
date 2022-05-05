package Ex33;

import java.util.Scanner;

public class Ex33_Cadastro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex33_Produto[] listaProdutos = new Ex33_Produto[10];
		
		for(int i = 0; i < listaProdutos.length; i++) {
			Ex33_Produto p = new Ex33_Produto();
			
			System.out.println("Digite o ID: ");
			p.id = ler.nextInt();
			
			System.out.println("Digite o Valor: ");
			p.valor = ler.nextDouble();
			
			System.out.println("Digite a Quantidade: ");
			p.quantidade = ler.nextDouble();
			
			System.out.println("Digite a Descrição: ");
			p.descricao = ler.next();
			
			listaProdutos[i] = p; 
			
		}
		
		System.out.println("-- Produtos com valor abaixo de 100 reais --");
		
		for(int i = 0; i < listaProdutos.length; i++) {
			if(listaProdutos[i].valor < 100) {
				System.out.println("Produto - ID: " + listaProdutos[i].id + ", Valor: " + listaProdutos[i].valor + ", Quantidade: " + listaProdutos[i].quantidade + " e Descrição: " + listaProdutos[i].descricao);
			}
		}
		
		ler.close();
		
	}
}