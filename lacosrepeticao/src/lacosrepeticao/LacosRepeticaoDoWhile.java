package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		
		int resultado = 0;
		
		do {
			System.out.println("Digite seu número:");
			numero = leia.nextInt();
			
			if(numero > 0) {
				resultado = resultado + numero;
			}
			
			} while(numero != 0);
		
		System.out.println("O resultado da sua soma é: " + resultado);
		
		

	}

}
