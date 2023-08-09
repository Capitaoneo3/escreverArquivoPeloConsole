package Teste;

public class Cliente {

	private String CPF;
	private String Nome;

	Cliente(String cpf, String nome) {
		this.CPF = cpf;
		this.Nome = nome;

	}
	Cliente() {
	

	}
	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return Nome;
	}
	public void setCPF(String cpf) {
		 this.CPF = cpf;
	}

	public void setNome(String nome) {
		 this.Nome = nome;
	}
	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", Nome=" + Nome + "]";
	}

}
