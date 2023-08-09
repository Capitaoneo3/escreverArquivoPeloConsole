package Teste;

public class Livro {

	private String titulo;
	private String autor;
	private String codigo;

	Livro(String Titulo, String autor, String codigo) {

		this.titulo = Titulo;
		this.autor = autor;
		this.codigo = codigo;

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getCodigo() {
		return codigo;
	}

}
