package br.com.zaffari.Biblioteca_v1;

public class Autor {

	private String Nome;
	private String Nascimento;
	private String Nacionalidade;

	Autor(String nome, String nascimento, String nacionalidade) {
		this.Nome = nome;
		this.Nascimento = nascimento;
		this.Nacionalidade = nacionalidade;

	}

	public String getNome() {
		return Nome;
	}

	public String getNascimento() {
		return Nascimento;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	@Override
	public String toString() {
		return "Autor [Nome=" + Nome + ", Nascimento=" + Nascimento + ", Nacionalidade=" + Nacionalidade + "]";
	}
}
