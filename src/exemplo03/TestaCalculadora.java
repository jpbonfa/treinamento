package exemplo03;

import javax.swing.JOptionPane;

public class TestaCalculadora {

	int numero1;
	int numero2;
	char operacao;

	public TestaCalculadora() {
		operacao = escolhaOperacao();
		calcular(operacao);
	}

	public char escolhaOperacao() {
		return JOptionPane
				.showInputDialog(
						"informe a operação : \n (+) - adiçao \n (-) - subtração \n (*) - multiplicação \n (/) - divisão")
				.charAt(0);
	}

	public void escolhaNumero() {
		numero1 = Integer.parseInt(JOptionPane
				.showInputDialog("informe o primeiro numero: "));
		numero2 = Integer.parseInt(JOptionPane
				.showInputDialog("informe o segundo numero: "));
	}

	public void calcular(char x) {
		switch (x) {
		case '+':
			escolhaNumero();
			JOptionPane.showMessageDialog(null, "o resultado da operaçao é :"
					+ (numero1 + numero2));
			break;
		case '-':
			escolhaNumero();
			JOptionPane.showMessageDialog(null, "o resultado da operaçao é :"
					+ (numero1 - numero2));
			break;
		case '*':
			escolhaNumero();
			JOptionPane.showMessageDialog(null, "o resultado da operaçao é :"
					+ (numero1 * numero2));
			break;
		case '/':
			escolhaNumero();

			JOptionPane.showMessageDialog(null, "o resultado da operaçao é :"
					+ (numero1 / numero2));
			break;

		default:
			JOptionPane.showMessageDialog(null, "operação invalida");
			break;
		}
	}

	public static void main(String[] args) {
		new TestaCalculadora();
	}

}
