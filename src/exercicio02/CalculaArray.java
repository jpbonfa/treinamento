package exercicio02;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

import exemplo09.Valida;

public class CalculaArray {// inicio da classe

	// atributos
	boolean valido = true;
	int numeros;

	List<Integer> arrayList = new ArrayList<Integer>();

	public CalculaArray() {
		informeNumeros();
		calcula();
	}

	public void informeNumeros() {// inicio do metodo
		for (int i = 0; i < 5; i++) {// inicio do for
			valido = true;
			while (valido) {// inicio do while
				try {// inicio do try
					numeros = Integer.parseInt(JOptionPane
							.showInputDialog("Insira os numeros"));
					if (Valida.verificaIntZero(numeros)) {// inicio do if
						JOptionPane.showMessageDialog(null,
								"Informe um numero maior que zero");

					} else {
						arrayList.add(numeros);
						valido = false;

					}// fim do if

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Informe um numero valido");

				}// fim do try

			}// fim do while

		}// fim do for

	}// fim do metodo

	public void calcula() {
		String maior = "";
		String menor = "";
		int soma = 0;
		int media = 0;

		Collections.sort(arrayList);

		maior = "1 - Maior elemento: " + arrayList.get(arrayList.size() - 1);
		menor = "2 - Menor elemento: " + arrayList.get(0);

		for (Integer numero : arrayList) {
			soma += numero;

		}
		media = soma / 5;
		JOptionPane.showMessageDialog(null, maior + "\n" + menor
				+ "\n3 - Soma dos elementos: " + soma
				+ "\n4 - Media dos elementos: " + media);
	}

	public static void main(String[] args) {// inicio main
		new CalculaArray();

	}// fim main
}// fim da classe