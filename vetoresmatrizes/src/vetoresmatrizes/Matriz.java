package vetoresmatrizes;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		int diagonalPrincipal;
		int diagonalSecundaria;
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		diagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		diagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
		
		System.out.println("Soma dos elementos da diagonal principal: " + diagonalPrincipal);
		System.out.println("Soma dos elementos da diagonal secundária: " + diagonalSecundaria);
		
	}

}
