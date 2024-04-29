package condicionais;

import java.util.Scanner;

public class TestandoCondicionais {

	public static void main(String[] args) {
		//Testes 
		
		// Projeto para testar códigos only
		
		//	int idade = 18;
		//	boolean carteiraM = true;
			
		//	if(idade >= 18 && carteiraM == true) {
		//		System.out.println("Você pode dirigir. ");
		//	} 
		//	else {
		//		System.out.println("Não pode dirigir.");

		Scanner leia = new Scanner(System.in);
		
			float nota1, nota2, media;
		
			System.out.println("Digite a primeira nota: ");
			nota1 = leia.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = leia.nextFloat();
			
			for(int i = 1; i <= 200;) {
				
			}

			media = (nota1 + nota2) / 2; 
			
			System.out.println("Sua média é: " + media);
			
			if (media >=6) {
				System.out.println("Você está APROVADO!");
			} else if (media == 5){
				System.out.println("Você está de exame!");
			} else {
				System.out.println("REPROVADO");
			}
			
	}

}
