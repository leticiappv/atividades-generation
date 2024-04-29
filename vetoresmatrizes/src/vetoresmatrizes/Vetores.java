package vetoresmatrizes;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		
		int numeros [] = {2, 5 , 1, 3, 4, 9, 7, 8, 10, 6, 9};
		int numeroEscolhido;
		boolean encontrado = false;
		
		System.out.println("Digite o número que queira achar");
		numeroEscolhido = leia.nextInt();

		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] == numeroEscolhido) {
				System.out.println("Numero selecionado na posição: " + i);
				encontrado = true;
			}
		}
		
		if(encontrado == false) {
			System.out.println("Numero inválido");
		}

	}

}
