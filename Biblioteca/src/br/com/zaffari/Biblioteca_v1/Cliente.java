package br.com.zaffari.Biblioteca_v1;

public class Cliente {

	String CPF;
	String Nome;

	Cliente(String cpf, String nome) {
		this.CPF = cpf;
		this.Nome = nome;

	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return Nome;
	}

	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", Nome=" + Nome + "]";
	}

}
