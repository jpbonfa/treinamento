package exemplo05;

public class Pessoa {
	private String nome;
	private int idade;

	public void exbirDados() {
		System.out.println("nome da pessoa: " + nome);
		System.out.println("idade da pessoa: " + idade);
	}

	public void receberDados(String nome , int idade) {
		this.nome = nome;
		this.idade = idade;

	}
}
