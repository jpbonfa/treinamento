package exemplo09;

import javax.swing.JOptionPane;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class VendaCarro {

	public Carro estoque[];
	public int opcao;
	public int tamanho;

	public String marca;
	public String modelo;
	public String placa;
	public int velocidadeMaxima;
	public String combustivel;
	public boolean disponivel;
	public boolean promocao;
	public double valor;
	public double valorPromocao;
	public double desconto;
	public String pesquisaModelo;
	public String pesquisaCombustivel;
	int aux = 1;

	public VendaCarro(Carro vetor[]) {
		this.estoque = vetor;
		escolhaOpcao();

	}

	public void escolhaOpcao() {
		boolean valido = true;
		while (valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane

								.showInputDialog("informe a opção \n 1- cadastrar  carro \n 2-exclui carro \n 3- listar estoque \n 4- consulta por modelo \n 5- consulta por combustivel \n 6- listar carros em promoção \n 7- efetuar venda \n 9- sair"));
				switch (opcao) {
				case 1:
					cadastrarCarro();
					break;
				case 2:
					excluiCarro();
					break;
				case 3:
					listarEstoque();
					break;
				case 4:
					pesquisarModelo();

					break;
				case 5:
					pesquisarCombustivel();
					break;
				case 6:
					listarCarrosPromocao();
					break;
				case 7:
					efetuarVenda();
					break;

				case 9:
					valido = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);
					break;

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}
		}
	}

	public void cadastrarCarro() {
		informeMarca();
		informeModelo();
		informePlaca();
		informeCombustivel();
		informeVelocidadeMaxima();
		informeValor();
		informeDesconto();
		informeDisponivel();
		informePromocao();
		gravaCarro();

	}

	public void informeMarca() {
		boolean valido = true;

		while (valido) {
			marca = JOptionPane.showInputDialog("insira a marca do carro");

			if (Valida.verificaStringVazio(marca)) {
				JOptionPane.showMessageDialog(null, Mensagem.informeMarca
						+ Mensagem.campoObrigatorio);
			} else {
				valido = false;

			}
		}

	}

	public void informeModelo() {
		boolean valido = true;
		while (valido) {
			modelo = JOptionPane.showInputDialog("insira o modelo do carro");
			if (Valida.verificaStringVazio(modelo)) {
				JOptionPane.showMessageDialog(null, Mensagem.informeModelo
						+ Mensagem.campoObrigatorio);
			} else {
				valido = false;
			}
		}

	}

	public void informePlaca() {
		boolean valido = true;
		while (valido) {
			placa = JOptionPane.showInputDialog("insira a placa do carro");
			if (Valida.verificaStringVazio(placa)) {
				JOptionPane.showMessageDialog(null, Mensagem.informePlaca
						+ Mensagem.campoObrigatorio);
			} else {
				valido = false;
			}
		}

	}

	public void informeVelocidadeMaxima() {
		boolean valido = true;
		while (valido) {
			try {
				velocidadeMaxima = Integer.parseInt(JOptionPane
						.showInputDialog(null, "informe velocidade maxima "));
				if (Valida.verificaIntZero(velocidadeMaxima)) {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeVelocidadeMaxima
									+ Mensagem.campoObrigatorio);
				} else {
					valido = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}

		}

	}

	public void informeCombustivel() {
		boolean valido = true;
		while (valido) {
			combustivel = JOptionPane
					.showInputDialog("insira o combustivel do carro");
			if (Valida.verificaStringVazio(combustivel)) {
				JOptionPane.showMessageDialog(null, Mensagem.informeCombustivel
						+ Mensagem.campoObrigatorio);
			} else {
				valido = false;
			}
		}

	}

	public void informeDisponivel() {
		int aux;
		boolean valido = true;
		while (valido) {
			try {
				aux = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a disponibilidade:  \n 1- disponivel \n 2- indisponivel"));
				if (Valida.validaDisponivel(aux)) {
					valido = false;
					if (aux == 1) {
						disponivel = true;
					} else {
						disponivel = false;
					}
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}
		}
	}

	public void informeValor() {
		boolean valido = true;
		while (valido) {
			try {
				valor = Double.parseDouble(JOptionPane
						.showInputDialog("informe valor do carro"));
				if (Valida.verificaDoubleZero(valor)) {
					JOptionPane.showMessageDialog(null, Mensagem.informeValor
							+ Mensagem.campoObrigatorio);

				} else {
					valido = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);
			}
		}

	}

	public void informeDesconto() {
		boolean valido = true;
		while (valido) {
			try {
				desconto = Double.parseDouble(JOptionPane
						.showInputDialog("informe o desconto do carro"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);
			}
		}

	}

	public void informePromocao() {
		int aux;
		boolean valido = true;
		while (valido) {
			try {
				aux = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a disponibilidade da promoção:  \n 1- disponivel \n 2- indisponivel"));
				if (Valida.validaDisponivel(aux)) {
					valido = false;
					if (aux == 1) {
						promocao = true;
						informeValorPromocao();
					} else {
						promocao = false;
						valorPromocao = 0;
					}
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}
		}

	}

	public void informeValorPromocao() {
		boolean valido = true;
		while (valido) {
			try {
				valorPromocao = Double.parseDouble(JOptionPane
						.showInputDialog("informe valor da promoção"));
				if (Valida.verificaDoubleZero(valorPromocao)) {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeValorPromocao
									+ Mensagem.campoObrigatorio);

				} else {
					valido = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);
			}
		}

	}

	public void gravaCarro() {
		Marca marca = new Marca();
		Modelo modelo = new Modelo();
		Carro carro = new Carro();

		marca.setNome(this.marca);
		modelo.setMarca(marca);
		modelo.setNome(this.modelo);
		carro.setModelo(modelo);
		carro.setPlaca(placa);
		carro.setCombustivel(combustivel);
		carro.setVelocidadeMaxima(velocidadeMaxima);
		carro.setValor(valor);
		carro.setValorPromocao(valorPromocao);
		carro.setDesconto(desconto);
		carro.setDisponivel(disponivel);
		carro.setPromoçao(promocao);

		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i] == null) {
				estoque[i] = carro;
				JOptionPane
						.showMessageDialog(null, "carro gravado com sucesso");
				break;
			}
		}
	}

	public void excluiCarro() {
		String informePlaca;
		informePlaca = JOptionPane
				.showInputDialog("Informe a placa do carro q deseja excluir");
		if (!Valida.verificaStringVazio(informePlaca)) {
			for (int i = 0; i < estoque.length; i++) {
				if (estoque[i].getPlaca().equals(informePlaca)) {
					estoque[i] = null;
					JOptionPane.showMessageDialog(null,
							"Veiculo excluido com sucesso");
					break;
				}

			}
		} else {
			JOptionPane.showInputDialog(null, Mensagem.informePlaca
					+ Mensagem.campoObrigatorio);
		}
	}

	public void listarEstoque() {

		int cont = 0;
		int aux = 1;
		for (Carro carro : estoque) {
			if (carro != null) {
				System.out.println("Carro - " + aux);
				System.out.println("");
				System.out.println("Modelo do carro: "
						+ carro.getModelo().getNome());
				System.out.println("Marca do carro: "
						+ carro.getModelo().getMarca().getNome());
				System.out.println("placa do carro: " + carro.getPlaca());
				System.out.println("combustivel do carro: "
						+ carro.getCombustivel());
				System.out.println("velocidadde maxima do carro: "
						+ carro.getVelocidadeMaxima() + "km/h");
				System.out.println("valor do carro: " + carro.getValor());
				System.out.println("desconto do carro: " + carro.getDesconto());
				System.out.print("disponibilidade do carro: ");
				if (carro.isDisponivel()) {
					System.out.print("sim");
					System.out.println("");
				} else {
					System.out.print("não");
					System.out.println("");
				}

				System.out.print("promoção  do carro: ");
				if (carro.isPromoçao()) {
					System.out.print("sim");
					System.out.println("");
				} else {
					System.out.print("não");
					System.out.println("");
				}
				System.out.println("valor da promoção do carro: "
						+ carro.getValorPromocao());
				System.out.println("");
				aux++;
				cont++;

			}

		}
		if (cont == 0) {
			System.out.println("nao existem carros cadastrados no estoque");
		}
	}

	public void pesquisarModelo() {
		boolean valido = true;
		int cont = 0;
		int aux = 1;
		while (valido) {

			pesquisaModelo = JOptionPane.showInputDialog("informe o modelo");
			if (!Valida.verificaStringVazio(pesquisaModelo)) {
				valido = false;
				for (Carro carro : estoque) {
					if (carro != null) {
						if (carro.getModelo().getNome()
								.equalsIgnoreCase(pesquisaModelo)) {
							System.out.println("Carro - " + aux);
							System.out.println("");
							System.out.println("Modelo do carro: "
									+ carro.getModelo().getNome());
							System.out.println("Marca do carro: "
									+ carro.getModelo().getMarca().getNome());
							System.out.println("placa do carro: "
									+ carro.getPlaca());
							System.out.println("combustivel do carro: "
									+ carro.getCombustivel());
							System.out.println("velocidadde maxima do carro: "
									+ carro.getVelocidadeMaxima() + "km/h");
							System.out.println("valor do carro: "
									+ carro.getValor());
							System.out.println("desconto do carro: "
									+ carro.getDesconto());
							System.out.print("disponibilidade do carro: ");
							if (carro.isDisponivel()) {
								System.out.print("sim");
								System.out.println("");
							} else {
								System.out.print("não");
								System.out.println("");
							}

							System.out.print("promoção  do carro: ");
							if (carro.isPromoçao()) {

								System.out.print("sim");
								System.out.println("");
							} else {
								System.out.print("não");
								System.out.println("");
							}
							System.out.println("valor da promoção do carro: "
									+ carro.getValorPromocao());
							System.out.println("");

							cont++;
							aux++;

						}
					}
				}
				if (cont == 0) {
					JOptionPane.showMessageDialog(null,
							"Modelo nao cadastrado no estoque");

				}
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeModelo
						+ Mensagem.campoObrigatorio);

			}
		}
	}

	public void pesquisarCombustivel() {
		boolean valido = true;
		int cont = 0;
		int aux = 1;
		while (valido) {

			pesquisaCombustivel = JOptionPane
					.showInputDialog("informe o combustivel");
			if (!Valida.verificaStringVazio(pesquisaCombustivel)) {
				valido = false;
				for (Carro carro : estoque) {
					if (carro != null) {
						if (carro.getCombustivel().equalsIgnoreCase(
								pesquisaCombustivel)) {
							System.out.println("Carro - " + aux);
							System.out.println("");
							System.out.println("Modelo do carro: "
									+ carro.getModelo().getNome());
							System.out.println("Marca do carro: "
									+ carro.getModelo().getMarca().getNome());
							System.out.println("placa do carro: "
									+ carro.getPlaca());
							System.out.println("combustivel do carro: "
									+ carro.getCombustivel());
							System.out.println("velocidadde maxima do carro: "
									+ carro.getVelocidadeMaxima() + "km/h");
							System.out.println("valor do carro: "
									+ carro.getValor());
							System.out.println("desconto do carro: "
									+ carro.getDesconto());
							System.out.print("disponibilidade do carro: ");
							if (carro.isDisponivel()) {
								System.out.print("sim");
								System.out.println("");
							} else {
								System.out.print("não");
								System.out.println("");
							}

							System.out.print("promoção  do carro: ");
							if (carro.isPromoçao()) {

								System.out.print("sim");
								System.out.println("");
							} else {
								System.out.print("não");
								System.out.println("");
							}
							System.out.println("valor da promoção do carro: "
									+ carro.getValorPromocao());
							System.out.println("");

							cont++;
							aux++;

						}
					}
				}
				if (cont == 0) {
					JOptionPane
							.showMessageDialog(null,
									"nao foi encontrado veiculos para esse combustivel no estoque");

				}
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeCombustivel
						+ Mensagem.campoObrigatorio);

			}
		}

	}

	public void listarCarrosPromocao() {
		int cont = 0;
		int aux = 1;
		for (Carro carro : estoque) {
			if (carro != null) {
				if (carro.isPromoçao()) {
					System.out.println("Carro - " + aux);
					System.out.println("");
					System.out.println("Modelo do carro: "
							+ carro.getModelo().getNome());
					System.out.println("Marca do carro: "
							+ carro.getModelo().getMarca().getNome());
					System.out.println("placa do carro: " + carro.getPlaca());
					System.out.println("combustivel do carro: "
							+ carro.getCombustivel());
					System.out.println("velocidadde maxima do carro: "
							+ carro.getVelocidadeMaxima() + "km/h");
					System.out.println("valor do carro: " + carro.getValor());
					System.out.println("desconto do carro: "
							+ carro.getDesconto());
					System.out.print("disponibilidade do carro: ");
					if (carro.isDisponivel()) {
						System.out.print("sim");
						System.out.println("");
					} else {
						System.out.print("não");
						System.out.println("");
					}

					System.out.print("promoção  do carro: ");
					if (carro.isPromoçao()) {
						System.out.print("sim");
						System.out.println("");
					} else {
						System.out.print("não");
						System.out.println("");
					}
					System.out.println("valor da promoção do carro: "
							+ carro.getValorPromocao());
					System.out.println("");
					cont++;
					aux++;
				}

			}

		}
		if (cont == 0) {
			System.out.println("nao exitem carros em promoção no estoque");
		}

	}

	public void efetuarVenda() {
		boolean valido = true;
		String escolhaPlaca;
		int cont = 0;
		while (valido) {

			escolhaPlaca = JOptionPane
					.showInputDialog("Inisra a placa do carro que deseja comprar ");

			if (!Valida.verificaStringVazio(escolhaPlaca)) {
				valido = false;
				for (Carro carro : estoque) {
					if (carro != null) {
						if (carro.getPlaca().equals(escolhaPlaca)) {
							cont++;
							if (carro.isDisponivel()) {
								processarVenda(carro);
							} else {
								JOptionPane.showMessageDialog(null,
										"Veiculo nao disponivel para a venda");
							}
						}
					}
				}
				if (cont == 0) {
					JOptionPane.showMessageDialog(null,
							"Veiculo não encontrado no estoque ");
				}
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informePlaca
						+ Mensagem.campoObrigatorio);
			}
		}
	}

	public void processarVenda(Carro carro) {
		double valorVenda = 0;
		double valorPago = 0;
		double troco = 0;
		boolean valido = true;

		if (carro.isPromoçao()) {
			valorVenda = carro.getValorPromocao();
		} else {
			valorVenda = carro.getValor();
		}

		while (valido) {
			try {
				valorPago = Double.parseDouble(JOptionPane
						.showInputDialog("Informe o valor pago "));
				if (Valida.verificaDoubleZero(valorPago)) {
					JOptionPane.showMessageDialog(null, Mensagem.informeValor
							+ Mensagem.campoObrigatorio);
				} else {
					valido = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.informeValor
						+ Mensagem.campoObrigatorio);
			}
		}

		valido = true;
		while (valido) {
			try {
				int aux = Integer
						.parseInt(JOptionPane
								.showInputDialog("Aplicar desconto? \n 1- SIM \n 2- NÃO"));
				if (aux != 1 && aux != 2) {
					JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);

				} else {
					valido = false;
					if (aux == 1) {
						valorVenda = valorVenda - carro.getDesconto();
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}
		}

		troco = valorPago - valorVenda;
		if (troco == 0) {
			JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso ");
		} else if (troco < 0) {
			JOptionPane.showMessageDialog(null, "Valor pago insulficiente");
			processarVenda(carro);
		} else {
			JOptionPane.showMessageDialog(null,
					"Venda efetuada com sucesso \n Troco: R$" + troco);
		}
	}
}
