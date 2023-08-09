package Teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testebufered {



	private static void escreveBaseDeClientes(ArrayList<Cliente> clientes) throws IOException {
		FileWriter arquivoclientes = new FileWriter(
			
			"C:/Users/Administrator/Documents/projetosProgamacao/JAVA/Biblioteca/clientes.txt");
			BufferedWriter cli = new BufferedWriter(arquivoclientes);
		for (Cliente cliente : clientes) {
			cli.write(cliente.getNome()+";");
			cli.write(cliente.getCPF()+";");
			cli.newLine();
			
		}
		cli.close();
	}



	static Cliente Joao = new Cliente(" 015254 ", " joao ");
	static Cliente Maria = new Cliente(" 015255 ", " Maria ");
	static Cliente Erik = new Cliente(" 015256 ", " Erik ");
	static Cliente Artur = new Cliente(" 015257 ", " Artur ");
	static Cliente Henrique = new Cliente(" 015258 ", " Henrique ");


	static ArrayList<Cliente> clientes = new ArrayList<>();
	static void inserirDados() throws IOException {
		String lowerReferencia="s";
		do {
		Cliente ClienteNovo = new Cliente();
		System.out.println("Este programa grava clientes: ele vai pedir a entrada de um novo cliente.");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Escreva o nome do cliente");
		ClienteNovo.setNome(myObj.nextLine());
		System.out.println("Escreva o cpf do cliente");
		ClienteNovo.setCPF(myObj.nextLine());
		System.out.println("Cliente salvo com sucesso");
		clientes.add(ClienteNovo);
		System.out.println("deseja inserir um novo cliente? digite 'S'");
		String lower = myObj.nextLine().toLowerCase();
		lowerReferencia = lower;
		} while (lowerReferencia.equals("s"));

		System.out.println("fim do programa.");
		
		escreveBaseDeClientes(clientes);
	}

	static void leBaseClientes() throws IOException {
		
		FileReader fr = new FileReader(
			"C:/Users/Administrator/Documents/projetosProgamacao/JAVA/Biblioteca/clientes.txt");

		BufferedReader Bf = new BufferedReader(fr);

		Scanner scanner = new Scanner(Bf);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] palavras = linha.split(";");
			Cliente clienteLaco = new Cliente(palavras[0], palavras[1]);
			clientes.add(clienteLaco);
			System.out.println("O cpf: " + palavras[0] + " o nome do cliente" + palavras[1]);
		}

		scanner.close();
		Bf.close();
	}

	static void retomarTrabalho() throws IOException {
		leBaseClientes();
	}

	public static void main(String[] args) throws IOException {
	// FileReader fr = new FileReader(
	// 			"C:/Users/educador/ProjetosProgramacao/JAVA/Biblioteca/src/br/com/zaffari/Biblioteca_v1/base_clientes.txt");
	// 	BufferedReader Bf = new BufferedReader(fr);
	// 	Scanner scanner = new Scanner(Bf);
	inserirDados();


		// if(scanner.hasNext()){
		// retomarTrabalho();
		// }
		// else{
		// escreveBaseDeClientes( Joao, Maria, Erik, Artur, Henrique);
		// }
		// scanner.close();
		// Bf.close();
	}
}