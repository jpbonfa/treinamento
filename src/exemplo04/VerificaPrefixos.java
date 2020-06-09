package exemplo04;

public class VerificaPrefixos {

	
	public static void main(String[] args) {
		
		String texto = "11 987110380";
		if (texto.startsWith("11")) {
			System.out.println("você é da região de São Paulo");
		}else{
			System.out.println("você não é da região de São Paulo");
					
		}

	}

}
