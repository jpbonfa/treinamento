package exemplo05;

public class TestaFilme {

	
	public static void main(String[] args) {
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		f1.cadastrar("vingadores","ação" ,10.0, true, false, 9.0);
		f2.cadastrar("piper", "romance", 20, false, true, 12.99);
		f1.exibir();
		f2.exibir();
		

	}

}
