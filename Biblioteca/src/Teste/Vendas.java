package Teste;

import java.time.LocalDate;

public class Vendas {

	private Cliente cliente;
	private Livro livro;
	private LocalDate DataVenda;

	Vendas(Cliente cliente,Livro livro,  LocalDate DataVenda) {

		this.cliente = cliente;
		this.livro = livro;
		this.DataVenda = DataVenda;

	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public LocalDate getDataVenda() {
		return DataVenda;
	}

}
