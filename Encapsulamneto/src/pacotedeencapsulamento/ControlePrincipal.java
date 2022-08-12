package pacotedeencapsulamento;

public class ControlePrincipal {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.play();
		c.ligarMenu();
	}

}
