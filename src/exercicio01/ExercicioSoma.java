package exercicio01;

import javax.swing.JOptionPane;

public class ExercicioSoma {
	int n1;
	int n2;
	int resultado;
	char soma;

	public static void main(String[] args) {
		int n1;
		int n2;
		int resultado;

		n1 = Integer.parseInt(JOptionPane
				.showInputDialog("insira o primeiro numero"));
		n2 = Integer.parseInt(JOptionPane
				.showInputDialog("insira o segundo numero"));

		resultado = n1 + n2;
		JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);

	}

}
