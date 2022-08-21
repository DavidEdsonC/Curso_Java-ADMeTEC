package projetoacademico;

public class JogadorDefesa extends Jogador{
	
	private int cobertura;
	private int desarme;
	

	public JogadorDefesa(String nome, int idade, int habilidade, int gol, int camisa, int cobertura, int desarme) {
		super(nome, idade, habilidade, gol, camisa);
		this.cobertura = cobertura;
		this.desarme = desarme;
	}
	
	public int getCobertura() {
		return cobertura;
	}
	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}
	public int getDesarme() {
		return desarme;
	}
	public void setDesarme(int desarme) {
		this.desarme = desarme;
	}
	
}
