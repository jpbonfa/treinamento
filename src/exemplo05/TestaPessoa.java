package exemplo05;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		String nome;
		int idade;

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		Scanner scanner = new Scanner(System.in);

		// dados da pessoa 1
		System.out.println("informe o nome da pessoa1: ");
		nome = scanner.next();
		System.out.println("informe a idade da pessoa1: ");
		idade = scanner.nextInt();
		pessoa1.receberDados(nome, idade);

		// dados da pessoa 2
		System.out.println("informe o nome da pessoa2: ");
		nome = scanner.next();
		System.out.println("informe a idade da pessoa2: ");
		idade = scanner.nextInt();
		pessoa2.receberDados(nome, idade);

		pessoa1.exbirDados();
		System.out.println("pessoa 1: " + pessoa1);
		pessoa2.exbirDados();
		System.out.println("pessoa 2: " + pessoa2);
		
		if (pessoa1 == pessoa2) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes ");
		}

	}
}
