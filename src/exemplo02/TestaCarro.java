package exemplo02;

import javax.swing.JOptionPane;

import exemplo03.Carro;

public class TestaCarro {

	String modelo;
	String placa;
	int velocidade;
	String combustivel;
	private boolean saveiro = true;
	private boolean sonata = true;

	String escolhaModelo ;
	String escolhaVelocidade ;
	String escolhaCombustivel ;

	public TestaCarro(Carro carro) {

		this.modelo = carro.getModelo();
		this.placa = carro.getPlaca();
		this.velocidade = carro.getVelocidade();
		this.combustivel = carro.getCombustivel();

		escolha();
	}

	public void escolha() {
		int opcao = Integer
				.parseInt(JOptionPane
						.showInputDialog("ESCOLHA A OPÇÃO:\n 1 - modelo \n 2 - velocidade \n  3 - combustivel"));
		if (opcao == 1) {
			escolhaModelo = JOptionPane.showInputDialog("informe o modelo");
			pesquisa();
		} else if (opcao == 2) {
			escolhaVelocidade = JOptionPane
					.showInputDialog("informe a velocidade");
			pesquisa();
		} else if (opcao == 3) {
			escolhaCombustivel = JOptionPane
					.showInputDialog("informe o combustivel");
			pesquisa();
		} else {
			JOptionPane.showMessageDialog(null, "opção invalida");
		}

	}

	public void pesquisa() {
		if (!escolhaModelo.equals("")) {
			if (escolhaModelo.equals(saveiro)) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		} else if (!escolhaVelocidade.equals("")) {
			if (Integer.parseInt(escolhaVelocidade) == velocidade) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
			}

		} else if (!escolhaCombustivel.equals("")) {
			if (escolhaCombustivel.equals(combustivel)) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
			}
		}
	}

	public boolean disponibilidade() {
		if (escolhaModelo.toUpperCase().equals("SAVEIRO")) {
			if (saveiro) {
				return true;

			} else {
				JOptionPane.showMessageDialog(null, "modelo indisponivel");
				return false;
			}

		} else if (escolhaModelo.toUpperCase().equals("SONATA")) {
			if (sonata) {
				return true;

			} else {
				JOptionPane.showMessageDialog(null, "modelo indisponivel");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "carro inexistente");
			return false;
		}
	}

	public static void main(String[] args) {
		Carro car1 = new Carro();
		car1.setModelo("fusca");
		car1.setPlaca("qwr-1234");
		car1.setCombustivel("gasolina");
		car1.setVelocidade(250);
		new TestaCarro(car1);
	}

}
