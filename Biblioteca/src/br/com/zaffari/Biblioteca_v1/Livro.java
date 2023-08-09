package br.com.zaffari.Biblioteca_v1;

import java.util.TreeMap;

import br.com.zaffari.Biblioteca_v1.EnumGenero.GenerosEnum;

public class Livro {

	private String Titulo;
	private String CodigoISBN;
	private Double preco;
	private int AnoLancamento;
	private GenerosEnum Categoria;
	private TreeMap<String,Autor> listaAutores = new TreeMap<String, Autor>();
	private String Editora;

	Livro(String titulo, String CodigoISBN, Double preco, int lancamento, GenerosEnum categoria, String autor,
			String editora) {
		this.Titulo = titulo;
		this.CodigoISBN = CodigoISBN;
		this.preco = preco;
		this.AnoLancamento = lancamento;
		this.Categoria = categoria;
		
		this.Editora = editora;
	}

	public Double getpreco() {
		return preco;
	}
	public String getCodigoISBN() {
		return CodigoISBN;
	}
	public Double getPreco() {
		return preco;
	}
	public int getAnoLancamento() {
		return AnoLancamento;
	}
	public GenerosEnum getCategoria() {
		return Categoria;
	}
	public String getEditora() {
		return Editora;
	}
	public String getCodigo() {
		return CodigoISBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public TreeMap<String, Autor> getListaAutores() {
		return listaAutores;
	}
	public void adicionaAutor(String chave,Autor autor) {
		listaAutores.put(chave ,autor);
	}
	@Override
	public String toString() {
		return "Livro [Titulo=" + Titulo + ", CodigoISBN=" + CodigoISBN + ", preco=" + preco + ", AnoLancamento="
				+ AnoLancamento + ", Categoria=" + Categoria + ", Autor="  + ", Editora=" + Editora + "]";
	}
}
