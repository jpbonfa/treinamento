package exemplo06;

import java.util.Scanner;

public class CalculaVetor {

	int quantidade[];
	int soma = 0;
	int media = 0;

	public CalculaVetor() {
		valorizaVetor();
		somaVetor();
		mediaVetor();
	}

	public void valorizaVetor() {
		quantidade = new int[5];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < quantidade.length; i++) {
			System.out.println("informe o " + (i + 1) + "º valor: ");
			quantidade[i] = teclado.nextInt();
		}
	}

	public void somaVetor() {
		for (int i = 0; i < quantidade.length; i++) {
			soma = soma + quantidade[i];
		}
		System.out.println("soma de todos os valores: " + soma);
	}

	public void mediaVetor() {
			media = soma /quantidade.length ;	
			
		
		System.out.println("a media do valores é: " + media );

	}

	public static void main(String[] args) {
		new CalculaVetor();

	}

}
