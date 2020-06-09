package exemplo02;

import javax.swing.JOptionPane;

public class AlugaFilmeModulo {

	double aluguelDiario = 15.00;
	double valorPago;
	int quantidadeDias;
	String filmeAlugado;
	boolean filmeInception = false;
	boolean filmeStolen = true;

	
	public AlugaFilmeModulo() {
		escolha();
		if (disponibilidade()) {
			calcular();
		}

	}

	public void escolha() {

		filmeAlugado = JOptionPane.showInputDialog("informe o nome do filme");

	}

	public boolean disponibilidade() {
		if (filmeAlugado.toUpperCase().equals("STOLEN")) {
			if (filmeStolen) {
				return true;

			} else {
				JOptionPane.showMessageDialog(null, "filme indisponivel");
				return false;
			}

		} else if (filmeAlugado.toUpperCase().equals("INCEPTION")) {
			if (filmeInception) {
				return true;

			} else {
				JOptionPane.showMessageDialog(null, "filme indisponivel");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "filme inexistente");
			return false;
		}
	}

	public void calcular() {
		valorPago = Double.parseDouble(JOptionPane
				.showInputDialog("informe o valor pago"));
		quantidadeDias = Integer.parseInt(JOptionPane
				.showInputDialog("informe os dias"));
		double resultado = aluguelDiario * quantidadeDias;
		if (valorPago < resultado) {
			JOptionPane.showMessageDialog(null, "valor pago insulficiente");
		} else if (valorPago > resultado) {
			JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
					+ " alugado com sucesso - troco: R$ "
					+ (valorPago - resultado));
		} else {
			JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
					+ " alugado com sucesso");
		}

	}

	public static void main(String[] args) {
		new AlugaFilmeModulo();
	}

}
