package projetoacademico;

public class Jogador {
	private String nome;
	protected int idade;
	protected int habilidade;
	private int gol;
	private int camisa;
	
	
	
	public Jogador(String nome, int idade, int habilidade, int gol, int camisa) {
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
		this.gol = gol;
		this.camisa = camisa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}
	public int getGol() {
		return gol;
	}
	public void setGol(int gol) {
		this.gol = gol;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
}
