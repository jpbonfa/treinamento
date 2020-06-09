package exemplo03;

import javax.swing.JOptionPane;

public class TestaCarroErro {
	String modelo = "cruze";
	String placa = "qwe-1234";
	int velocidade = 250;
	String combustivel = "gasolina";
	String cor = "branco";
	boolean disponivel = true;

	String escolhaModelo = "";
	String escolhaVelocidade = "";
	String escolhaCombustivel = "";
	String escolhaCor = "";

	public TestaCarroErro() {
		escolha();

	}

	public void escolha() {
		int opcao = Integer
				.parseInt(JOptionPane
						.showInputDialog("ESCOLHA A OPÇÃO:\n 1 - modelo \n 2 - velocidade \n  3 - combustivel \n 4 - cor"));
		switch (opcao) {
		case 1:
			escolhaModelo = JOptionPane.showInputDialog("informe o modelo");
			pesquisa();

			break;
		case 2:
			escolhaVelocidade = JOptionPane
					.showInputDialog("informe a velocidade");
			pesquisa();
			break;
		case 3:
			escolhaCombustivel = JOptionPane
					.showInputDialog("informe o combustivel");
			pesquisa();
			break;
		case 4:
			escolhaCor = JOptionPane.showInputDialog("informe a cor");
			pesquisa();

			break;

		default:
			JOptionPane.showMessageDialog(null, "opção invalida");
			break;
		}

	}

	public void pesquisa() {
		if (!escolhaModelo.equals("")) {
			if (escolhaModelo.toUpperCase().equals(modelo.toUpperCase())) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
				System.out.println("cor do carro: " + cor);
				disponibilidade();
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
			}
		} else if (!escolhaVelocidade.equals("")) {
			if (Integer.parseInt(escolhaVelocidade) == velocidade) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
				System.out.println("cor do carro: " + cor);
				disponibilidade();
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
			}

		} else if (!escolhaCombustivel.equals("")) {
			if (escolhaCombustivel.equals(combustivel)) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
				System.out.println("cor do carro: " + cor);
				disponibilidade();
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");

			}
		} else if (!escolhaCor.equals("")) {
			if (escolhaCor.equals(cor)) {
				System.out.println("modelo do carro: " + modelo);
				System.out.println("placa do carro: " + placa);
				System.out.println("velocidade do carro: " + velocidade);
				System.out.println("combustivel do carro: " + combustivel);
				System.out.println("cor do carro: " + cor);
				disponibilidade();
			} else {
				JOptionPane.showMessageDialog(null, "veiculo nao encontrado");
			}
		}
	}

	public void disponibilidade() {

		if (disponivel) {
			System.out.println("modelo disponivel");

		} else {
			System.out.println("modelo indisponivel");

		}
	}

	public static void main(String[] args) {
		new TestaCarroErro();

	}
}
