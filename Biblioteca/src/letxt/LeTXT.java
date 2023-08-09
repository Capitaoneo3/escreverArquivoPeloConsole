package letxt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

public class LeTXT {

	// Main class
	
	    // Method 1
	    // To read the file using class
	    private static void readUsingClass(String fileName)
	        throws IOException
	    {
	        // criando um objeto da classe caminho
	        Path path = Paths.get(fileName);
	 
	        // para ler arquivo para byte array
	        byte[] bytes = Files.readAllBytes(path);
	 
	        // exibir apenas mensagem
	        System.out.println(
	            "Leia o arquivo de texto usando a classe Files");
	 
	        //Lendo o arquivo para a lista de strings
	        @SuppressWarnings("unused")
	 
	        // Criando um objeto de classe List do tipo string 
	       // como dados no arquivo a serem lidos são palavras
	        List<String> allLines = Files.readAllLines(
	            path, StandardCharsets.UTF_8);
	        System.out.println(new String(bytes));
	    }
	 
	    // Method 2
	    // Método do driver principal
	    public static void main(String[] args)
	        throws IOException
	    {
	        // Diretório de entrada personalizado passado onde o texto
	        String fileName
	            = "C:\\\\Dev\\\\biblioteca_digital\\\\base_dados\\\\base_clientes.txt";
	 
	        // read using FileReader, no encoding support, not
	        // efficient
	        readUsingClass(fileName);
	    }
	}
	
	
	

