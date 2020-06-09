package exemplo06;

import javax.swing.JOptionPane;

public class MaiorMenorVetor {

	int tamanho;
	int numeros[];
	int valor;
	int soma = 0;
	int media = 0;
	int opcao;

	int maior;
	int menor;

	public MaiorMenorVetor() {

		informeTamanho();
		informeElementos();
		escolhaOpcao();
		maiorElemento();
		menorElemento();
		somaVetor();
		mediaVetor();
	}

	public void escolhaOpcao() {
		boolean token = true;
		while (token) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a opção : \n 1 - mostra maior  \n 2 - mostra menor \n 3 - soma do vetor \n 4 - media do vetor \n 5 - ordem crescente \n 6 - ordem decrescente "));
				switch (opcao) {
				case 1:
					token = false;
					maiorElemento();
					break;
				case 2:
					token = false;
					menorElemento();
					break;
				case 3:
					token = false;
					somaVetor();
					break;
				case 4:
					token = false;
					mediaVetor();
					break;
				case 5:
					token = false;
					ordenaCrescente();
					break;
				case 6:
					token = false;
					ordenaDecresce();
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

	public void informeTamanho() {
		boolean valido = true;

		while (valido) {
			try {
				tamanho = Integer.parseInt(JOptionPane
						.showInputDialog("insira um tamanho"));
				if (tamanho != 0) {
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"insira um tamanho valido");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um tamanho valido");
			}
		}
	}

	public void informeElementos() {
		numeros = new int[tamanho];

		for (int i = 0; i < numeros.length; i++) {

			boolean valido = true;
			while (valido) {
				try {
					valor = Integer.parseInt(JOptionPane
							.showInputDialog("insira um valor"));
					valido = false;
					numeros[i] = valor;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"insira um tamanho valido");
				}
			}

		}
	}

	public void maiorElemento() {
		maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		System.out.println("o maior elemento é: " + maior);

	}

	public void menorElemento() {

		menor = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("o menor elemento é: " + menor);

	}

	public void somaVetor() {
		for (int num : numeros) {
			soma += num;
		}
		System.out.println("a soma do vetor é: " + soma);
	}

	public void mediaVetor() {
		media = soma / numeros.length;
		System.out.println(" a media do vetor é: " + media);
	}

	public void ordenaCrescente() {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < numeros.length; cont1++) {
			for (cont2 = 0; cont2 < numeros.length - 1; cont2++) {
				if (numeros[cont2] > numeros[cont2 + 1]) {
					aux = numeros[cont2];
					numeros[cont2] = numeros[cont2 + 1];
					numeros[cont2 + 1] = aux;
				}

			}
		}
		System.out.print("numeros ordenados crescente: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("");
	}

	public void ordenaDecresce() {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < numeros.length; cont1++) {
			for (cont2 = 0; cont2 < numeros.length - 1; cont2++) {
				if (numeros[cont2] < numeros[cont2 + 1]) {
					aux = numeros[cont2];
					numeros[cont2] = numeros[cont2 + 1];
					numeros[cont2 + 1] = aux;
				}

			}
		}
		System.out.print("numeros ordenados decrescente: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		new MaiorMenorVetor();
	}
}
