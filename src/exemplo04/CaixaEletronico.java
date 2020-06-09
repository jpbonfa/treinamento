package exemplo04; 

import javax.swing.JOptionPane;

public class CaixaEletronico {
	int valorUsuario;
	int nota2 = 2;
	int nota5 = 5;
	int nota10 = 10;
	int nota20 = 20;
	int nota50 = 50;
	int resultado2;
	int resultado5;
	int resultado10;
	int resultado20;
	int resultado50;
	int resto;

	boolean valido = false;

	public CaixaEletronico() {
		escolhaValor();
		calcular();
	}

	public void escolhaValor() {

		while (!valido) {
			try {
				valorUsuario = Integer.parseInt(JOptionPane
						.showInputDialog("insira o valor a ser sacado:"));
				valido = true;
			} catch (Exception erro) {
				// erro.printStackTrace();
				JOptionPane.showMessageDialog(null, "informe um valor valido");
			}
		}

	}

	public void calcular() {

		resultado50 = valorUsuario / nota50;

		resto = valorUsuario % nota50;
		System.out.println(resultado50 + " notas de 50");

		resultado20 = resto / nota20;
		resto = resto % nota20;
		System.out.println(resultado20 + " notas de 20");

		resultado10 = resto / nota10;
		System.out.println(resultado10 + " notas de 10");
		resto = resto % nota10;
		
		resultado5 = resto / nota5;
		System.out.println(resultado5 + " notas de 5");
		resto = resto % nota5;
		
		resultado2 = resto / nota2;
		System.out.println(resultado2 + " notas de 2");
		resto = resto  % nota2 ;
	}

	public static void main(String[] args) {
		new CaixaEletronico();
	}

}