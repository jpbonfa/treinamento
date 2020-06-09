package exemplo05;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;

	public void cadastrar(String nome, int idade, double salario) {

		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public void exibir() {
		System.out.println("nome do funcionario: " + nome);
		System.out.println("idade do funcionario: " + idade);
		System.out.println("salario do funcionario: " + salario);
		if (idade > 17) {
			System.out.println(nome + " é maior de idade");

		} else {
			System.out.println(nome + " é menor de idade");
		}
		System.out.println("");
	}

}
