package exemplo05;

public class Filme {
	private String nome;
	private String genero;
	private double valor;
	private boolean disponivel;
	private boolean promo�ao;
	private double valorPromocao;

	public void cadastrar(String nome, String genero, double valor,
			boolean disponivel, boolean promo�ao, double valorPromocao) {

		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.disponivel = disponivel;
		this.promo�ao = promo�ao;
		this.valorPromocao = valorPromocao;
	}

	public void exibir() {

		System.out.println("o nome do filme: " + nome);
		System.out.println(" o genero do filme: " + genero);
		if (promo�ao) {
			System.out.println("este filme esta em promo�ao");
			System.out.println("valor do filme:" + valorPromocao);
		} else {
			System.out.println("este filme n�o esta em promo�ao");
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
