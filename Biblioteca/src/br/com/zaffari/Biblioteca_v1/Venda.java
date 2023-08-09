package br.com.zaffari.Biblioteca_v1;

import java.time.LocalDate;

public class Venda {

	Livro livro;
	private Cliente cliente;
	private LocalDate DataVenda;

	Venda(Cliente cliente, Livro livro, LocalDate DataVenda) 
	{
		this.livro=livro;
		this.cliente = cliente;
		this.DataVenda = DataVenda;

	}
	


	
	public Cliente getCliente() {
		return cliente;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getDataVenda() {
		return DataVenda;
		
	}
	public void setDataVenda(LocalDate dataVenda) {
		DataVenda = dataVenda;
	}
	@Override
	public String toString() {
		return "Data da Compra:" + DataVenda + " Livro Comprado por:" + cliente;
	}
}