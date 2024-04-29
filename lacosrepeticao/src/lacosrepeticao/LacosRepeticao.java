package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int primeiroNumero;
		int segundoNumero;
	
		System.out.println("Digite o primeiro número");
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o segundo número");
		segundoNumero = leia.nextInt();
		
		if(primeiroNumero >= segundoNumero) {
			System.out.println("Formato inválido");
		}
		else {
			for(int i = primeiroNumero; i <= segundoNumero;) {
				i++;
				
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(String.valueOf(i) + " é multiplo de 3 e 5 \n");
				}
			}		
		}
		
		
		}
}
