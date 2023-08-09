package br.com.zaffari.Biblioteca_v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import br.com.zaffari.Biblioteca_v1.EnumGenero.GenerosEnum;

public class CatalogoLivros {

	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	public void AdicionaLivro(Livro livro) {
		livros.add(livro);
	}
	public List<Livro> RetornarLivroPorTitulo(String Titulo) {

		List<Livro> matches = new ArrayList<Livro>();

		for (Livro livro : livros) {
			if (livro.getTitulo().contains(Titulo)) {
				matches.add(livro);
			}

		}
		return matches;

	}
	public void RetornarLivroPorAutor(String nomeAutor){
		List<Livro> matches = new ArrayList<Livro>();

			for(Livro livro : livros) {			
				 for(Entry<String, Autor> autor: livro.getListaAutores().entrySet()) {
					 if(autor.getValue().getNome().contains(nomeAutor)) {
						 matches.add(livro);
					 }
				 }
	} System.out.println(matches);
}
	public static List<Livro> filtrarLivrosPorFaixaDePreco( double precoMin, double precoMax) {
		List<Livro> livrosFiltrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getPreco() >= precoMin && livro.getPreco() <= precoMax) {
				livrosFiltrados.add(livro);
			}
		}

		return livrosFiltrados;
	}
	public Livro buscaLivroPorChave(String ISBN13) {
		ArrayList<Livro> resultadoBusca = new ArrayList<Livro>();
	for(Livro element : livros) {
		if(element.getCodigoISBN().equals(ISBN13)) {
			resultadoBusca.add(element);
		}
	} Livro livro = resultadoBusca.get(0);
	return livro;
	}
	public List<Livro> RetornarLivroPorCategoria(GenerosEnum Categoria) 
	{

		List<Livro> matches = new ArrayList<Livro>();

		for (Livro livro : livros) {
			if (livro.getCategoria().equals(Categoria)) 
			{
				matches.add(livro);
			}

		}
		return matches;
	}
	@Override
	public String toString() {
		return "CatalogoLivros [livros=" + livros + "]";
	}

}