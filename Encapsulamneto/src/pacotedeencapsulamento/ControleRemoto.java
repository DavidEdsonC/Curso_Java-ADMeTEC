package pacotedeencapsulamento;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligar;
	private boolean tocando;
	
	//Construtor
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligar = false;
		this.tocando = false;
	}
	
	//Métodus getters e setters
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	private boolean getLigar() {
		return ligar;
	}
	
	private void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Métodus Abstratos
	
	@Override
	public void ligar() {
		
		this.setLigar(true);
		
	}

	@Override
	public void desligar() {
		
		this.setLigar(false);
	}

	@Override
	public void maisVolume() {
		
		if (getLigar()) {
			this.setVolume(getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		
		if (getLigar()) {
			this.setVolume(getVolume() - 1);
		}
	}

	@Override
	public void ligarMenu() {
		
		System.out.println("---- Menu ----");
		System.out.println("Esta ligado ? " + this.getLigar());
		System.out.println("Esta tocando ? " + this.getTocando());
		System.out.print("Volume "+ this.getVolume());
		for(int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print(" | ");
		}
	}

	@Override
	public void desligarMenu() {
		
		System.out.println("Fechando Menu...");
	}

	@Override
	public void ligarMudo() {
		
		if(getLigar() && getVolume() > 0) {
			setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		
		if(getLigar() && getVolume() == 0) {
			setVolume(50);
		}
	}

	@Override
	public void play() {
		
		if(this.getLigar() && !(this.getTocando())); {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		
		if(this.getLigar() && this.getTocando()) {
			this.setTocando(false);;
		}
	}
	
}