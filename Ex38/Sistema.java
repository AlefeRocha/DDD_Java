package Ex38;

import java.io.IOException;

import java.util.Scanner;

import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		
		ArrayList<Produto> listaProduto = new ArrayList<>();
		
		int opcao, idC, id;
		double preco, quantidade;
		String nome, possuiCat, nomeC;
		Categoria categoria;
		
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.printf(" 	1 - Adicionar Produto \n	2 - Atualizar Produto \n	3 - Excluir Produto \n	4 - Exibir Produtos \n	5 - Sair \n");
			System.out.println("Digite a opção necessária: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Produto produto = new Produto();
				
				id = listaProduto.size() + 1 ;
				produto.setId(id);
				
				System.out.printf("Digite o Nome do Produto: ");
				nome = ler.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o Preço do Produto: ");
				preco = ler.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a Quantidade de Produto: ");
				quantidade = ler.nextDouble();
				produto.setQuantidade(quantidade);
				
				System.out.println("Esse produto possui categoria(S/N)? ");
				possuiCat = ler.next().toUpperCase();
				
				if(possuiCat.equals("S")) {
					Categoria ct = new Categoria();
					
					System.out.println("Digite o ID da categoria: ");
					idC = ler.nextInt();
					ct.setIdc(idC);
					
					System.out.println("Digite a categoria do Produto: ");
					nomeC = ler.next();
					ct.setNomeC(nomeC);
					
					produto.setCategoria(ct);
				}else {
					categoria = null;
				}
				
				listaProduto.add(produto);
				
				System.out.println("Produto adicionado com sucesso!");
				
				System.in.read();
				
			}
			
			else if (opcao == 2) {
				for(Produto p : listaProduto) {
					System.out.printf("ID %d, Nome do Produto %s, Preço %.2f e Quantidade %.2f \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
				}
				
				System.out.printf("\nDigite o ID do produto que deseja atualizar: ");
				id = ler.nextInt();
				
				System.out.printf("\nDigite o novo Nome que o produto receberá: ");
				nome = ler.next();
				
				System.out.printf("\nDigite o novo Preço do Produto: ");
				preco = ler.nextDouble();
				
				System.out.printf("\nDigite a nova Quantidade de produtos: ");
				quantidade = ler.nextDouble();
				
				Produto produto = listaProduto.get(id- 1);
				
				produto.setNome(nome);
				produto.setPreco(preco);
				produto.setQuantidade(quantidade);
				
				System.out.println("O produto foi atualizado com sucesso!");
				System.in.read();
				
			}
			
			else if (opcao ==  3) {
				for(Produto p : listaProduto) {
					System.out.printf("ID: %d Nome do Produto: %s Preço: %.2f Quantidade %.2f \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());					
				}
				
				System.out.printf("\n Digite o ID do produto que quer excluir: ");
				id = ler.nextInt();
				
				listaProduto.remove(id - 1);
				
				System.in.read();
					
			}
			
			else if (opcao == 4) {
				for (Produto p : listaProduto) {
					System.out.printf("\nID: %d, Nome do Produto: %s, Preço %.2f e Quantidade: %.2f \n %s \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade(),p.getExbirCategoria());
				}
			}
			
		}while (opcao != 5);
		
		ler.close();
	}
}