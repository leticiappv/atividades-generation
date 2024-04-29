package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Escreva uma cor");
			String cor = leia.next();
			
			strings.add(cor);
			Collections.sort(strings);
		}
		System.out.println("Sua lista ordenada é: " + strings);

	}

}
