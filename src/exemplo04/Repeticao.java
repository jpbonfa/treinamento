package exemplo04;

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = true;
	String message = "o carro 1 � azul\n" + "";

	public Repeticao() {
		while (exit) {
			processar();

		}
	}

	public void processar() {
		int opcao = Integer.parseInt(JOptionPane
				.showInputDialog("informe a op��o: "));
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "op��o 1");
			testaWhile();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "op��o 2");
			testaDoWhile();
			
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "op��o 3");
			testaFor();
			break;
		case 9:
			exit = false;
			break;

		default:
			JOptionPane.showMessageDialog(null, "op��o invalida");
			break;

		}
	}

	public void testaWhile() {
		int i = 0;
		while (i < 10) {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
			i = i + 1;

		}
	}

	public void testaDoWhile() {
		int i = 0;

		do {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
			i = i + 1;

		} while (i < 10);
	}
	public void testaFor(){
		for (int i = 0; i < 10 ; i++) {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
		}
	}

	public static void main(String[] args) {
		new Repeticao();
	}

}
