package exercicio01;

import javax.swing.JOptionPane;

public class ExercicioVetor {

	public int numeros[];
	public int vetorAux[];

	public int x;

	public int opcao;
	public int tamanho;
	public double somaMenor = 0;
	public double somaMaior = 0;
	public double somaIgual = 0;
	public double mediaMaior = 0;
	public double mediaMenor = 0;
	public double mediaIgual = 0;
	public double contIgual = 0;
	public double contMaior = 0;
	public double contMenor = 0;

	public ExercicioVetor() {
		tamanho();
		informeElemento();
		escolhaX();
		copiaVetor();
		imprimirMaior();
		imprimirMenor();
		imprimirIgual();
		verificaCrescente();
		somaMaior();
		somaMenor();
		somaIgual();

		mediaMaior();
		mediaMenor();
		mediaIgual();
	}

	public void tamanho() {
		boolean valido = true;
		while (valido) {
			try {
				tamanho = Integer.parseInt(JOptionPane
						.showInputDialog("insira um tamanho de vetor"));
				if (tamanho > 0) {
					valido = false;

				} else {
					JOptionPane.showMessageDialog(null,
							"insira um tamanho valido");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "tamanho invalido");
			}

		}
	}

	public void informeElemento() {
		int numero = 0;
		numeros = new int[tamanho];
		for (int i = 0; i < this.numeros.length; i++) {

			boolean valido = true;
			while (valido) {
				try {
					numero = Integer.parseInt(JOptionPane
							.showInputDialog("insira um valor"));
					valido = false;
					this.numeros[i] = numero;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"insira um valor valido");
				}
			}

		}
	}

	public void escolhaX() {
		boolean valido = true;
		while (valido) {
			try {
				x = Integer.parseInt(JOptionPane
						.showInputDialog("insira o valor x"));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um valor valido");
			}
		}

	}

	public void imprimirMaior() {
		int aux = 0;
		System.out.print("numeros maiores que x: ");
		for (int i = 0; i < this.numeros.length; i++) {

			if (this.numeros[i] > x) {
				contMaior++;
				if (aux > 0) {
					System.out.print(",");

				}
				System.out.print(this.numeros[i]);
				aux++;

			}
		}
		if (aux == 0) {
			System.out.print("nao existe");
		}
	}

	public void somaMaior() {
		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > x) {
				somaMaior = numeros[i] + somaMaior;
			}

		}
		System.out.println("");
		System.out.println("a soma dos numeros maiores que x é : " + somaMaior);
	}

	public void mediaMaior() {
		System.out.println("");
		if (contMaior > 0) {
			mediaMaior = somaMaior / contMaior;
		} else {
			mediaMaior = 0;
		}

		System.out.println(" a media dos numeros maiores que x é: "
				+ mediaMaior);

	}

	public void somaIgual() {

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == x) {
				somaIgual = numeros[i] + somaIgual;
			}

		}

		System.out.println("a soma dos numeros iguais que x é : " + somaIgual);
	}

	public void mediaIgual() {
		if (contIgual > 0) {
			mediaIgual = somaIgual / contIgual;
		} else {
			mediaIgual = 0;
		}

		System.out
				.println(" a media dos numeros iguais que x é: " + mediaIgual);

	}

	public void somaMenor() {

		for (int i = 0; i < numeros.length; i++) {
			if (x > numeros[i]) {
				somaMenor = numeros[i] + somaMenor;
			}

		}
		System.out.println("a soma dos numeros menores que x é : " + somaMenor);
	}

	public void mediaMenor() {
		if (contMenor > 0) {
			mediaMenor = somaMenor / contMenor;
		} else {
			mediaMenor = 0;
		}

		System.out.println(" a media dos numeros menores que x é: "
				+ mediaMenor);

	}

	public void imprimirMenor() {
		int aux = 0;
		System.out.println(" ");
		System.out.print("numeros menores que x: ");
		for (int i = 0; i < this.numeros.length; i++) {

			if (this.numeros[i] < x) {
				contMenor++;
				if (i > 0) {
					System.out.print(",");

				}
				System.out.print(this.numeros[i]);
				aux++;

			}

		}
		if (aux == 0) {
			System.out.print("nao existe");
		}
	}

	public void imprimirIgual() {
		int aux = 0;
		System.out.println(" ");
		System.out.print("numeros iguais a x: ");
		for (int i = 0; i < this.numeros.length; i++) {

			if (this.numeros[i] == x) {
				contIgual++;
				if (aux > 0) {
					System.out.print(",");

				}
				System.out.print(this.numeros[i]);
				aux++;
			}
		}
		if (aux == 0) {
			System.out.print("nao existe");
		}
	}

	public void copiaVetor() {
		vetorAux = new int[tamanho];
		for (int i = 0; i < this.numeros.length; i++) {
			this.vetorAux[i] = this.numeros[i];
		}
	}

	public void verificaCrescente() {
		System.out.println("");
		ordenaCrescente();
		int aux = 0;
		System.out.println(" ");

		for (int i = 0; i < this.vetorAux.length; i++) {
			if (this.numeros[i] != this.vetorAux[i]) {
				aux++;
			}
		}
		if (aux == 0) {

			System.out.print("vetor: ordenado crescente");
		} else {
			verificaDecrescente();
		}
	}

	public void ordenaCrescente() {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < this.numeros.length; cont1++) {
			for (cont2 = 0; cont2 < this.numeros.length - 1; cont2++) {
				if (this.numeros[cont2] > this.numeros[cont2 + 1]) {
					aux = this.numeros[cont2];
					this.numeros[cont2] = this.numeros[cont2 + 1];
					this.numeros[cont2 + 1] = aux;
				}

			}
		}
	}

	public void verificaDecrescente() {

		ordenaDecrescente();

		int aux = 0;
		System.out.println("");

		for (int i = 0; i < this.vetorAux.length; i++) {
			if (this.numeros[i] != this.vetorAux[i]) {
				aux++;
			}
		}
		if (aux == 0) {
			System.out.print("vetor: ordenado decrescente");

		} else {
			System.out.print("vetor: não ordenado");

		}
	}

	public void ordenaDecrescente() {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < this.numeros.length; cont1++) {
			for (cont2 = 0; cont2 < this.numeros.length - 1; cont2++) {
				if (this.numeros[cont2] < this.numeros[cont2 + 1]) {
					aux = this.numeros[cont2];
					this.numeros[cont2] = this.numeros[cont2 + 1];
					this.numeros[cont2 + 1] = aux;
				}

			}
		}
	}

	public static void main(String[] args) {
		new ExercicioVetor();
	}
}
