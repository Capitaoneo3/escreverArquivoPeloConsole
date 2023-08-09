package Teste;

public class JoaoPedro {
		
	String nome;
	String CPF;
	int idade;
	
	JoaoPedro(String nome,String CPF,int idade){
		this.nome=nome;this.CPF=CPF;this.idade=idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
