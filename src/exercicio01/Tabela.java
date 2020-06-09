package exercicio01;

import javax.swing.JOptionPane;

public class Tabela {
	int valor;
	int codigo;
	double aumento = 0.0;
	double resultado;

	public Tabela() {
		escolhaValor();
		escolhaCodigo();
		calcular();
	}

	public void escolhaValor() {
		boolean valido = true;
		while (valido) {

			try {
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("insira o valor do produto "));
				if (valor != 0) {
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"insira um valor valido");

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um valor valido");
			}

		}

	}

	public void escolhaCodigo() {
		boolean valido = true;
		while (valido) {
			try {
				codigo = Integer.parseInt(JOptionPane
						.showInputDialog("insira o codigo de aumento "));
				switch (codigo) {
				case 1:
					aumento = 0.1;
					valido = false;
					break;
				case 3:
					aumento = 0.25;
					valido = false;
					break;
				case 4:
					aumento = 0.3;
					valido = false;
					break;
				case 8:
					aumento = 0.5;
					valido = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "codigo invalido");
					break;

				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um codigo valido");
			}

		}

	}

	public void calcular() {
		resultado = valor + (valor * aumento);
		JOptionPane.showMessageDialog(null, resultado);

	}

	public static void main(String[] args) {
		new Tabela();
	}
}
