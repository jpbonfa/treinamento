package exemplo04;

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = true;
	String message = "o carro 1 é azul\n" + "";

	public Repeticao() {
		while (exit) {
			processar();

		}
	}

	public void processar() {
		int opcao = Integer.parseInt(JOptionPane
				.showInputDialog("informe a opção: "));
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "opção 1");
			testaWhile();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "opção 2");
			testaDoWhile();
			
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "opção 3");
			testaFor();
			break;
		case 9:
			exit = false;
			break;

		default:
			JOptionPane.showMessageDialog(null, "opção invalida");
			break;

		}
	}

	public void testaWhile() {
		int i = 0;
		while (i < 10) {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i = i + 1;

		}
	}

	public void testaDoWhile() {
		int i = 0;

		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i = i + 1;

		} while (i < 10);
	}
	public void testaFor(){
		for (int i = 0; i < 10 ; i++) {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
		}
	}

	public static void main(String[] args) {
		new Repeticao();
	}

}
