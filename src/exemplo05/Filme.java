package exemplo05;

public class Filme {
	private String nome;
	private String genero;
	private double valor;
	private boolean disponivel;
	private boolean promoçao;
	private double valorPromocao;

	public void cadastrar(String nome, String genero, double valor,
			boolean disponivel, boolean promoçao, double valorPromocao) {

		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.disponivel = disponivel;
		this.promoçao = promoçao;
		this.valorPromocao = valorPromocao;
	}

	public void exibir() {

		System.out.println("o nome do filme: " + nome);
		System.out.println(" o genero do filme: " + genero);
		if (promoçao) {
			System.out.println("este filme esta em promoçao");
			System.out.println("valor do filme:" + valorPromocao);
		} else {
			System.out.println("este filme não esta em promoçao");
			System.out.println("valor do filme:" + valor);

		}
		if (disponivel) {
			System.out.println("filme disponivel");

		} else {
			System.out.println(" filme indisponivel");

		}
		System.out.println("");

	}

}
