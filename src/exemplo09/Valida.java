package exemplo09;

public class Valida {

	public static boolean verificaStringVazio(String args) {
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean verificaIntZero(int args) {
		if (args == 0) {
			return true;
		} else {
			return false;
			
		}
	}
	public static boolean validaDisponivel(int args){
		if (args == 1 || args == 2 ) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean verificaDoubleZero(double args) {
		if (args == 0) {
			return true;
		} else {
			return false;
		}
	}
}
