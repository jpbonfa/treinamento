package exemplo02;

import javax.swing.JOptionPane;

public class AlugaFilme {

	public static void main(String[] args) {
		double aluguelDiario = 15.00;
		double valorPago;
		int quantidadeDias;
		String filmeAlugado;
		boolean filmeInception = true;
		boolean filmeStolen = true;

		String opcao = JOptionPane.showInputDialog("informe o nome do filme");

		// veerificaçao da disponibilidade do filme
		if (opcao.toUpperCase().equals("STOLEN")) {
			filmeAlugado = opcao.toUpperCase();
			if (filmeStolen) {
				valorPago = Double.parseDouble(JOptionPane
						.showInputDialog("informe o valor pago"));
				quantidadeDias = Integer.parseInt(JOptionPane
						.showInputDialog("informe os dias"));
				double resultado = aluguelDiario * quantidadeDias;
				if (valorPago < resultado) {
					JOptionPane.showMessageDialog(null,
							"valor pago insulficiente");
				} else if (valorPago > resultado) {
					JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
							+ " alugado com sucesso - troco: R$ "
							+ (valorPago - resultado));
				} else {
					JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
							+ " alugado com sucesso");
				}

			} else {
				JOptionPane.showMessageDialog(null, "filme não disponivel");
			}
		} else if (opcao.toUpperCase().equals("INCEPTION")) {
			filmeAlugado = opcao.toUpperCase();
			if (filmeInception) {
				valorPago = Double.parseDouble(JOptionPane
						.showInputDialog("informe o valor pago"));
				quantidadeDias = Integer.parseInt(JOptionPane
						.showInputDialog("informe os dias"));

				double resultado = aluguelDiario * quantidadeDias;
				if (valorPago < resultado) {
					JOptionPane.showMessageDialog(null,
							"valor pago insulficiente");
				} else if (valorPago > resultado) {
					JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
							+ " alugado com sucesso - troco: R$ "
							+ (valorPago - resultado));
				} else {
					JOptionPane.showMessageDialog(null, "filme " + filmeAlugado
							+ " alugado com sucesso");
				}

			} else {
				JOptionPane.showMessageDialog(null, "filme não disponivel");
			}

		}
	}

}
