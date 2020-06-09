package exemplo05;

public class Cliente {

	private String nome;
	private int idade;
	private char sexo;
	private double limite;

	public Cliente() {
	}

	public Cliente(String nome, int idade, char sexo, double limite) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.limite = limite;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
