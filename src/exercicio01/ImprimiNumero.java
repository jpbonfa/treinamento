package exercicio01;

import javax.swing.JOptionPane;

public class ImprimiNumero {

	int num1;
	int num2;
	int opcao;

	public ImprimiNumero() {

		escolhaNum1();
		escolhaNum2();
		escolhaOperacao();

	}

	public void escolhaOperacao() {
		boolean valido = true;
		while (valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a operação : \n 1- soma todos  \n 2- apenas numeros pares \n 3- apenas numeros impares \n 4- calcula media"));
				switch (opcao) {
				case 1:
					valido = false;
					somaTodos();
					break;
				case 2:

					valido = false;
					somaPares();
					break;
				case 3:
					valido = false;
					somaImpares();
				case 4:
					valido = false;
					calculaMedia();
					break;

				default:
					JOptionPane.showMessageDialog(null, "opção indisponivel");
					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "opção indisponivel");
			}

		}
	}

	public void escolhaNum1() {
		boolean valido = true;
		while (valido) {

			try {
				num1 = Integer.parseInt(JOptionPane
						.showInputDialog("insira o inicio "));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um inicio valido");
			}
		}

	}

	public void escolhaNum2() {
		boolean valido = true;
		while (valido) {

			try {
				num2 = Integer.parseInt(JOptionPane
						.showInputDialog("insira um fim "));
				if (num2 != 0 && num2 > num1) {
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null, "insira um fim valido");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um fim valido");
			}
		}

	}

	public void somaImpares() {

		int soma = 0;
		for (int i = num1; i < num2; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}

		}
		System.out.println(soma);
	}

	public void somaPares() {
		int soma = 0;
		for (int i = num1; i < num2; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}

		}
		System.out.println(soma);
	}

	public void somaTodos() {
		int soma = 0;
		for (int i = num1; i < num2; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
	}

	public void calculaMedia() {
		int soma = 0;
		int elementos = 0;
		double media;
		for (int i = num1; i < num2; i++) {
			soma = soma + i;
			elementos++;

		}
		media = soma / elementos;
		System.out.println(media);
	}

	public static void main(String[] args) {
		new ImprimiNumero();

	}
}
