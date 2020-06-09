package exemplo05;

public class Cachorro {
	private String nome;
	private String raca;
	private String cor;

	public Cachorro() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void cadastrar(String nome, String raca, String cor) {

		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
	}

	public void exibir() {
		System.out.println("nome do cachorro: " + nome);
		System.out.println("raca do cachorro: " + raca);
		System.out.println("cor do cachorro: " + cor);
		System.out.println("");
	}
}
