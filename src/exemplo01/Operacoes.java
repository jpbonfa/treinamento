package exemplo01;

public class Operacoes {
	public static void main(String[] args) {
		// exemplo de adicao
		int adicao = 1 + 1;
		// exemplo de subtraçao
		int subtracao = 45 - 2;
		// exemplo de multiplicaçao
		int multiplicacao = 24 * 3;
		// exemplo de divisao
		double divisao = 25 / 6.0;
		// exemplo de modulo
		int modulo = 10 % 3;

		String num1 = "25";
		String num2 = "6";
		String resultado;

		System.out.println("1+1 = " + adicao);
		System.out.println("45-2 = " + subtracao);
		System.out.println("24*3 = " + multiplicacao);
		System.out.println("25/6 = " + divisao);
		System.out.println("10%3 = " + modulo);

		divisao= Double.parseDouble(num1)* Double.parseDouble(num2);
		System.out.println(divisao);
	}

}
