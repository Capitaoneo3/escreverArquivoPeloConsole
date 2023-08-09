package br.com.zaffari.Biblioteca_v1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class CatalogodeVendas {
	String iSBN13_2 = null;
	Integer valorComparavel = 0;
	
	List<Venda> registroTotalDeVendas = new ArrayList<Venda>();
	Map<String, Integer> buscaLivroMaisVendido = new HashMap<String,Integer>();
	ArrayList<Venda> livrosVendidos = new ArrayList<Venda>();
	ArrayList<Integer> maisvendido = new ArrayList<Integer>();
	
	public void adicionaVenda(Venda compra) {
		livrosVendidos.add(compra);
	}
	public void imprimeCompraDeCliente(String nomeCliente) {
		ArrayList<String> listaResultado = new ArrayList<String>();

		for (Venda element : livrosVendidos) {
			if (element.getCliente().getNome().equals(nomeCliente)) {
				listaResultado.add(element.getCliente().getNome() + element);
			}
		}
		System.out.println(listaResultado);
	}
	public void vendasUltimosSeteDias() 
	{
		List<Livro> vendas = new ArrayList<Livro>();
		for (Venda venda : livrosVendidos) {
				LocalDate comeco = venda.getDataVenda();
				LocalDate hoje = LocalDate.now();
			
				long diferencaDeDias = comeco.until(hoje,ChronoUnit.DAYS);
					if(diferencaDeDias <= 7){
						vendas.add(venda.getLivro());
			}
		}
		System.out.println(vendas);
	}		
	public List<Livro> VendasMesDeJunho()
	{
		List<Livro> livrosVendidosMesJunho = new ArrayList<Livro>();
		for (Venda venda : livrosVendidos) {
			
			if(venda.getDataVenda().getMonthValue() == 6) {
				
				livrosVendidosMesJunho.add(venda.getLivro());
			}
		}
		return livrosVendidosMesJunho;
		}	
	public void TotalVendasJunho() {
		double valor = 0;
		for (Venda venda : livrosVendidos) {
			if(venda.getDataVenda().getMonthValue() == 6) {
				
				valor = venda.getLivro().getPreco() + valor;
				
		}
	} System.out.println("O lucro total no mes de junho foi " + valor);		
}
	protected void LivroMaisVendido() {
		
		for (Venda venda : livrosVendidos) {
				String ISBN13 = venda.getLivro().getCodigoISBN();
				
				
				if (buscaLivroMaisVendido.containsKey(ISBN13)) 
				{
					Integer aux_valor = buscaLivroMaisVendido.get(ISBN13);
					aux_valor = aux_valor + 1;
					buscaLivroMaisVendido.put(ISBN13, aux_valor);
				}
				else 
				{
					buscaLivroMaisVendido.put(ISBN13, 1);
				}
			}		
	}
	public void checaLivroMaisVendido(CatalogoLivros catalogoLivro) {
		LivroMaisVendido();
		String chave = null;
			for (Entry<String, Integer> element2 : buscaLivroMaisVendido.entrySet()) {
				Integer valorElemento = element2.getValue();
					if(valorElemento > valorComparavel) {
						setValorComparavel(valorElemento);
						chave = element2.getKey();
				}
		}  System.out.println("O Livro mais vendido foi: " + catalogoLivro.buscaLivroPorChave(chave) + " com um total de " + valorComparavel + " vendas!");
	}	
	public Integer getValorComparavel() {
		return valorComparavel;
	}
	public void setValorComparavel(Integer valorComparavel) {
		this.valorComparavel = valorComparavel;
	}
}
