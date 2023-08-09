package Teste;

//import java.util.Map.Entry;

//import br.com.zaffari.Biblioteca_v1.Venda;

//public class GuardaCodigo {
//	public void livroMaisVendido() {
//		
//		
//		
//		for (Venda element : LivrosVendidos) {
//				String ISBN13 = element.getLivro().getCodigoISBN();
//				if (BuscaLivroMaisVendido.containsKey(ISBN13)) 
//				{
//					Integer aux_valor = BuscaLivroMaisVendido.get(ISBN13);
//					aux_valor = aux_valor + 1;
//					BuscaLivroMaisVendido.put(ISBN13, aux_valor);
//				}
//				else 
//				{
//					BuscaLivroMaisVendido.put(ISBN13, 1);
//				}
//		}
//		
//}
//
//public void checaLivroMaisVendido() {
//	livroMaisVendido();
//	String chave = null;
//		for (Entry<String, Integer> element2 : BuscaLivroMaisVendido.entrySet()) {
//			Integer valorElemento = element2.getValue();
//				if(valorElemento > valorComparavel) {
//					setValorComparavel(valorElemento);
//					chave = element2.getKey();
//			}
//	}  System.out.println("O Livro mais vendido foi: " + retornaLivroPorISBN13(chave) + " com um total de " + valorComparavel + " vendas!");
//}
//
//	
//	
//	
//public void setValorComparavel(Integer valorComparavel) {
//	this.valorComparavel = valorComparavel;
//}
//
//}





//Diz o caminho a ser escrito
//FileWriter fw = new FileWriter("C:\\Dev\\biblioteca_digital\\base_dados\\base_testeDoJoao.txt");
////Escreve no arquivo
//BufferedWriter bw = new BufferedWriter(fw);
//
//	bw.write("Oi, eu sou o " + jp.getNome() + " e eu tenho " + jp.getIdade() + " anos");
//bw.close();