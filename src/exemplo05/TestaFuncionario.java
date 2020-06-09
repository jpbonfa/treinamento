package exemplo05;

public class TestaFuncionario {
	

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		f1.cadastrar("jobson", 18, 100000.00);
		f2.cadastrar("walter", 42, 600.00);
		f3.cadastrar("tania", 12, 20000.00);
		f1.exibir();
		f2.exibir();
		f3.exibir();

	}

}
