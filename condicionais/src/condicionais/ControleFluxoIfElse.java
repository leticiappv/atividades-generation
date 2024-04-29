package condicionais;

public class ControleFluxoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int estoque = 35;
		
		if (estoque >=100) {
			System.out.println("Produtos em quantidade suficiente.");
		} else if (estoque <100 && estoque >50) {
			System.out.println("Por favor, verifique o estoque e faça o pedido de mais produtos.");
		}else {
				System.out.println("Estoque insuficiente.");
			}
			
		}
		
		
	}


