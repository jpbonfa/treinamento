package exemplo05;

public class TestaCachorro {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Cachorro c3 = new Cachorro();
		c1.cadastrar("bolinha", "poodle", "preto");
		c2.cadastrar("doug", "vira-lata", "marrom");
		c3.cadastrar("toto", "pit-bull", "branco");
		c1.exibir();
		
		c2.exibir();
		c3.exibir();
	}
	

}
