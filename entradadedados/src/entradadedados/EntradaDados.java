package entradadedados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia  = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		
		idade = leia.nextInt();
		
		System.out.println("A sua idade é: " + idade);
		
		System.out.printf("A sua idade é: %d\n", idade);
		
		String primeiroNome = "Letícia";
		String sobrenome = "Pinheiro Pedrosa de Vasconcelos";
		String nomeCompleto = primeiroNome + sobrenome;
		
		
		leia.nextLine(); //limpeza de buffer - limpar a memoria para receber novos dados via teclado
		
		
		System.out.println("Digite sua altura sem o ponto ou vírgula: ");
		
		int altura = leia.nextInt();
		
		System.out.println("Sua altura é: " + altura);
		
	
		
		
	}

}
