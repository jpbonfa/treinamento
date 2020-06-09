package exemplo09;

public class Carro {

	private Modelo modelo;
	private String placa, combustivel;
	private int velocidadeMaxima;
	private double valor, valorPromocao, desconto;
	private boolean disponivel;
	private boolean promoçao;

	public Carro() {
	}

	public Carro(Modelo modelo, String placa, String combustivel,
			int velocidadeMaxima, double valor, double valorPromocao,
			double desconto, boolean disponivel, boolean promoçao) {
		this.modelo = modelo;
		this.placa = placa;
		this.combustivel = combustivel;
		this.velocidadeMaxima = velocidadeMaxima;
		this.valor = valor;
		this.valorPromocao = valorPromocao;
		this.desconto = desconto;
		this.disponivel = disponivel;
		this.promoçao = promoçao;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorPromocao() {
		return valorPromocao;
	}

	public void setValorPromocao(double valorPromocao) {
		this.valorPromocao = valorPromocao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isPromoçao() {
		return promoçao;
	}

	public void setPromoçao(boolean promoçao) {
		this.promoçao = promoçao;
	}

}
