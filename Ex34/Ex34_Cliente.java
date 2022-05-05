package Ex34;

public class Ex34_Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public Ex34_ContaBancaria conta;
	

	Ex34_Cliente(){
	}
	
	
	Ex34_Cliente(int id, String nome, int idade, String email, Ex34_ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	
	void atualizarEmail(String email) {
		this.email = email;
	}
	
	
	String exibirNomeIdade() {
		return "\nNome " + this.nome.toUpperCase() + " e " + "Idade " + this.idade;
	}
	
	
	String exibirDadosConta() {
		return "\nAgência: " + this.conta.agencia + ", Numero: " + this.conta.numero + " e Saldo: " + this.conta.saldo;
	}
	
}