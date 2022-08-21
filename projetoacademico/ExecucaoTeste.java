package projetoacademico;

public class ExecucaoTeste {

	public static void main(String[] args) {
		Jogador j = new Jogador("David", 34, 100, 5, 10);
		System.out.println(j.getNome());
		System.out.println(j.getIdade());
		System.out.println(j.getHabilidade());
		System.out.println(j.getGol());
		System.out.println(j.getCamisa());

	}

}
