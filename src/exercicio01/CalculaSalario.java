package exercicio01;

import javax.swing.JOptionPane;

public class CalculaSalario {
	double salarioFunc;
	double salarioMin;
	double resultado;

	public CalculaSalario() {
		informaSalarioFuncionario();
		informaSalarioMinimo();
		calcula();

	}

	public void informaSalarioFuncionario() {
		boolean valido = true;
		while (valido) {

			try {
				salarioFunc = Integer.parseInt(JOptionPane
						.showInputDialog("insira o salario do funcionario"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um valor valido");
			}
		}

	}

	public void informaSalarioMinimo() {
		boolean valido = true;
		while (valido) {

			try {
				salarioMin = Integer.parseInt(JOptionPane
						.showInputDialog("insira o salario minimo"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um valor valido");
			}
		}

	}

	public void calcula() {
		resultado = (salarioFunc / salarioMin);
		JOptionPane.showMessageDialog(null, "o funcionario recebe " + resultado
				+ " salarios minimos");

	}

	public static void main(String[] args) {
		new CalculaSalario();
	}

}
