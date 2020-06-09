package exemplo05;

import javax.swing.JOptionPane;

public class CalculaIdade {
	int ano;
	int mes;
	int dia;
	int resultado = 0;

	public CalculaIdade() {
		escolhaAno();
		escolhaMes();
		escolhaDias();
		calculaTotal();
	}

	public void escolhaAno() {
		boolean valido = true;
		while (valido) {

			try {
				ano = Integer.parseInt(JOptionPane
						.showInputDialog("insira a quantidade de anos"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um ano valido");
			}
		}

	}

	public void escolhaMes() {
		boolean valido = true;

		while (valido) {

			try {
				mes = Integer.parseInt(JOptionPane
						.showInputDialog("insira a quantidade de meses"));
				if (mes < 13) {
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null, "insira um mes valido");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um mes valido");
			}
		}

	}

	public void escolhaDias() {
		boolean valido = true;
		while (valido) {

			try {
				dia = Integer.parseInt(JOptionPane
						.showInputDialog("insira a quantidade de dias"));
				if (dia < 30) {
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"insira um numero de dias valido");

				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"insira um numero de dias valido");
			}
		}

	}

	public void calculaTotal() {
	resultado = (ano *365) + (mes*30)+ dia;
	JOptionPane.showMessageDialog(null, "o total de dias vivido é : " + resultado);
	

	}

	public static void main(String[] args) {
		new CalculaIdade();
	}

}
