package projetoacademico;

public class JogadorAtacante extends Jogador{
	
	private int velocicade;
	private int tecnica;
	
	public JogadorAtacante(String nome, int idade, int habilidade, int gol, int camisa, int velocicade, int tecnica) {
		super(nome, idade, habilidade, gol, camisa);
		this.velocicade = velocicade;
		this.tecnica = tecnica;
	}

	public int getVelocicade() {
		return velocicade;
	}

	public void setVelocicade(int velocicade) {
		this.velocicade = velocicade;
	}

	public int getTecnica() {
		return tecnica;
	}

	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}
	
}
