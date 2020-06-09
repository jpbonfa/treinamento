package exemplo01;

/**
 * primeiro exemplo de classses desenvolvido
 * 
 * @author USER
 * @since 20/4/20
 */
public class ClasseExemplo {

	// este metodo não possui retorno, apenas executa uma ação
	public void exibirDados() {
		System.out.println("hello world");
	}

	// este metodo retornara uma string
	public String retonarnaString() {
		return "hello world !";

	}

	// este metodo retonara um contexto boleeano
	public boolean varificaParametro(int aux) {
		if (aux == 0) {
			return true;

		} else {
			return false;

		}
	}

	public static void main(String[] args) {
		ClasseExemplo obj = new ClasseExemplo();
		// obj.exibirDados();
		// System.out.println(obj.retonarnaString());
		/*
		 
		if (obj.varificaParametro(0)) {
			System.out.println("retornou true");

		} else {
			System.out.println("retotnou false");
		}
		*/
		System.out.println("retotnou " + obj.varificaParametro(1));
	}

}
