package exemplo04;

public class LacoIncremento {

	public static void main(String[] args) {
		int ind = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("[dentro do laço] i vale ;" + i);
			ind++;
		}
		if (ind == 0) {
			System.out.println("nao passou no for");
		}else {
			System.out.println("passou no for");
		}
		
	}

}
