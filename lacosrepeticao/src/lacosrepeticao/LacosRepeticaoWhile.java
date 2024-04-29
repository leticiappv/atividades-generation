package lacosrepeticao;

import java.util.Scanner;

public class LacosRepeticaoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int menorVinte = 0;
		int maiorCinquenta = 0;
		
		while(idade >= 0) {

			System.out.println("Valor da idade é: " + idade);
			System.out.println("Deseja continuar? número positivo para sim e negativo para não: \n");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menorVinte = menorVinte + 1;
			}
			else if(idade > 50 && idade >= 0) {
				maiorCinquenta = maiorCinquenta + 1;
			}
			System.out.println("Total de pessoas com menos de 21 anos: " + menorVinte);
			System.out.println("Total de pessoas com mais de 50 anos: " + maiorCinquenta);
		}
	}
	}

