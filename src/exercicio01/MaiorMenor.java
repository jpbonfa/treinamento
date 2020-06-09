package exercicio01;

import javax.swing.JOptionPane;

public class MaiorMenor {
	int opcao;
	int num1;
	int num2;
	int num3;
	int maior;
	int menor;

	public MaiorMenor() {

		escolhaNum1();
		escolhaNum2();
		escolhaNum3();
		escolhaOpcao();
	}

	public void escolhaNum1() {
		boolean valido = true;
		while (valido) {

			try {
				num1 = Integer.parseInt(JOptionPane
						.showInputDialog("insira um numero"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um numero valido");
			}
		}

	}

	public void escolhaNum2() {
		boolean valido = true;
		while (valido) {

			try {
				num2 = Integer.parseInt(JOptionPane
						.showInputDialog("insira um numero "));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um numero valido");
			}
		}

	}

	public void escolhaNum3() {
		boolean valido = true;
		while (valido) {

			try {
				num3 = Integer.parseInt(JOptionPane
						.showInputDialog("insira um numero"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um numero valido");
			}
		}

	}

	public void escolhaOpcao() {
		boolean valido = true;
		while (valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a opção : \n 1- mostra maior  \n 2- mostra menor \n 3- ordem crescente \n 4- ordem decrescente "));
				switch (opcao) {
				case 1:
					valido = false;
					maiorElemento();
					break;
				case 2:
					valido = false;
					menorElemento();
					break;
				case 3:
					valido = false;
					ordenaMaior();
					break;
				case 4:
					valido = false;
					ordenaMenor();
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

	public void maiorElemento() {
		if (num1 > num2 && num1 > num3) {

			System.out.println("Este e o maior deles: " + num1);
			maior = num1;

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Este e o maior deles: " + num2);
			maior = num2;

		} else {
			System.out.println("Este e o maior deles: " + num3);
			maior = num3;

		}

	}

	public void menorElemento() {
		if (num1 <= num2 && num1 <= num3) {
			menor = num1;

			System.out.println("Este e o menor deles: " + num1);

		} else if (num2 <= num1 && num2 <= num3) {
			menor = num2;
			System.out.println("Este e o menor deles: " + num2);

		} else {
			menor = num3;
			System.out.println("Este e o menor deles: " + num3);

		}

	}

	public void ordenaMaior() {
		maiorElemento();
		menorElemento();

		if (num1 < maior && num1 > menor) {
			System.out.println(menor + "," + num1 + "," + maior);

		}
		if (num2 < maior && num2 > menor) {
			System.out.println(menor + "," + num2 + "," + maior);

		}
		if (num3 < maior && num3 > menor) {
			System.out.println(menor + "," + num3 + "," + maior);
		}

	}

	public void ordenaMenor() {
		maiorElemento();
		menorElemento();

		if (num1 < maior && num1 > menor) {
			System.out.println(maior + "," + num1 + "," + menor);

		}
		if (num2 < maior && num2 > menor) {
			System.out.println(maior + "," + num2 + "," + menor);

		}
		if (num3 < maior && num3 > menor) {
			System.out.println(maior + "," + num3 + "," + menor);
		}
		if (num1 == num2 || num1 == num3) {
			System.out.println(maior + "," + num1 + "," + menor);

		}
	

		}

	

	public static void main(String[] args) {
		new MaiorMenor();
	}
}
