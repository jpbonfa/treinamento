package exemplo02;


public class Produto {
	String nome;
	int quantidade;
	double custo;
	double porcentagemLucro;
	int unidadeVendidas;

	public void processar() {
		nome = "papel";
		quantidade = 1;
		custo = 10.0;
		porcentagemLucro = 20;
		unidadeVendidas = 200;

		System.out.println(nome);
		System.out.println(custo + ((porcentagemLucro * custo) / 100));
		System.out.println(unidadeVendidas);
		System.out.println(unidadeVendidas * (custo + ((porcentagemLucro * custo) / 100)));
	}

	public static void main(String[] args) {
		Produto prod = new Produto();
		prod.processar();
	}
}
