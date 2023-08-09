package br.com.zaffari.Biblioteca_v1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import br.com.zaffari.Biblioteca_v1.EnumGenero.GenerosEnum;

public class Biblioteca {
	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		CatalogodeVendas catalogovendas = new CatalogodeVendas();
		Create ct = new Create();
		
		
		Livro bruxa = new Livro("bruxa", "1",70.0 ,2002, GenerosEnum.Ação, "joao", "del record");
		bruxa.adicionaAutor("Joao", new Autor("joao","28/07/2000","Brasileiro"));
		Livro feiticeiro = new Livro("feiticeiro", "2",66.0 ,2003, GenerosEnum.Ação, "erik", "los angeles");
		feiticeiro.adicionaAutor("Joao", new Autor("joao","28/07/2000","Brasileiro"));
		Livro mago = new Livro("mago", "1",40.0 ,2004, GenerosEnum.Romance, "joao", "literaria");
		mago.adicionaAutor("Joao", new Autor("joao","28/07/2000","Brasileiro"));
		Livro bardo = new Livro("bardo", "1",30.0 ,2005, GenerosEnum.Ação, "alisson", "limits");
		bardo.adicionaAutor("Joao", new Autor("joao","28/07/2000","Brasileiro"));
		Livro guerreiro = new Livro("guerreiro", "1",50.0 ,2006, GenerosEnum.Ação, "artur", "saldanha");
		guerreiro.adicionaAutor("maria", new Autor("maria","28/07/2001","Brasileira"));
		Livro arqueiro  = new Livro("arqueiro", "1",50.0 ,2007, GenerosEnum.Romance, "gabriel", "souza");
		arqueiro.adicionaAutor("maria", new Autor("maria","28/07/2001","Brasileira"));
		Livro elfo = new Livro("elfo", "1",20.0 ,2008, GenerosEnum.Romance, "bruno", "fallfall");
		elfo.adicionaAutor("gabriel", new Autor("gabriel","28/07/2002","Brasileiro"));
		Livro anão = new Livro("anão", "1",90.0 ,2009, GenerosEnum.Comédia, "joao", "fallfall");
		anão.adicionaAutor("gaby", new Autor("gaby","28/07/1999","Brasileira"));
		Livro gigante = new Livro("gigante", "1",30.0 ,2010, GenerosEnum.Terror, "joao", "fallfall");
		gigante.adicionaAutor("silvia", new Autor("silvia","28/07/1999","Brasileira"));
		Livro hobbit = new Livro("hobbit", "1",15.0 ,2002, GenerosEnum.Drama, "joao", "fallfall");
		hobbit.adicionaAutor("henrique", new Autor("henrique","28/07/1998","Brasileiro"));
		
		catalogoLivros.AdicionaLivro(bruxa);
		catalogoLivros.AdicionaLivro(feiticeiro);
		catalogoLivros.AdicionaLivro(mago);
		catalogoLivros.AdicionaLivro(bardo);
		catalogoLivros.AdicionaLivro(guerreiro);
		catalogoLivros.AdicionaLivro(arqueiro);
		catalogoLivros.AdicionaLivro(elfo);
		catalogoLivros.AdicionaLivro(anão);
		catalogoLivros.AdicionaLivro(gigante);
		catalogoLivros.AdicionaLivro(hobbit);
		
		Cliente joao = new Cliente("01", "joao");
		Cliente maria = new Cliente("02", "maria");
		Cliente erik = new Cliente("03", "erik");
		Cliente adriane = new Cliente("04", "adriane");
		Cliente henrique = new Cliente("05", "henrique");
		
		Venda venda1 = new Venda(joao, bruxa, LocalDate.of(2023, Month.JUNE, 20));
		Venda venda2 = new Venda(maria, elfo, LocalDate.of(2023, Month.FEBRUARY, 17));
		Venda venda3 = new Venda(maria, feiticeiro, LocalDate.of(2023, Month.JUNE, 30));
		Venda venda4 = new Venda(maria, feiticeiro, LocalDate.of(2023, Month.JUNE, 11));
		Venda venda5 = new Venda(adriane, feiticeiro, LocalDate.of(2023, Month.JUNE, 10));
		Venda venda6 = new Venda(henrique, feiticeiro, LocalDate.of(2023, Month.JUNE, 10));
		Venda venda7 = new Venda(erik, feiticeiro, LocalDate.of(2023, Month.JUNE, 9));
		Venda venda8 = new Venda(erik, feiticeiro, LocalDate.of(2023, Month.JUNE, 8));
		Venda venda9 = new Venda(adriane, feiticeiro, LocalDate.of(2023, Month.JUNE, 4));
		Venda venda10 = new Venda(maria, feiticeiro, LocalDate.of(2023, Month.JUNE, 5));
		
		catalogovendas.adicionaVenda(venda1);
		catalogovendas.adicionaVenda(venda2);
		catalogovendas.adicionaVenda(venda3);
		catalogovendas.adicionaVenda(venda4);
		catalogovendas.adicionaVenda(venda5);
		catalogovendas.adicionaVenda(venda6);
		catalogovendas.adicionaVenda(venda7);
		catalogovendas.adicionaVenda(venda8);
		catalogovendas.adicionaVenda(venda9);
		catalogovendas.adicionaVenda(venda10);
		
		
		//1
		List<Livro> livrosResultado = catalogoLivros.RetornarLivroPorTitulo("bruxa");
		System.out.println(livrosResultado);
		
		//2
		catalogoLivros.RetornarLivroPorAutor("joao");
		
		//3
		List<Livro> livrosResultado2 = catalogoLivros.RetornarLivroPorCategoria(GenerosEnum.Ação);
		System.out.println(livrosResultado2);
		
		//4
		System.out.println(catalogoLivros.filtrarLivrosPorFaixaDePreco( 30.0, 50.0));
		
		//5
		catalogovendas.vendasUltimosSeteDias();
		
		//6
		System.out.println(catalogovendas.VendasMesDeJunho());
		
		//7
		catalogovendas.checaLivroMaisVendido(catalogoLivros);
	
		//8
		catalogovendas.TotalVendasJunho();
		
		
		CatalogoLivros Cl = new CatalogoLivros();
		

	}
	
	
	}



