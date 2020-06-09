package exercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import exemplo09.Valida;

public class VerificaArrayList {
	public String elemento;

	List<String> lista = new ArrayList<String>();

	public VerificaArrayList() {
		escolhaOpcao();

	}

	public void escolhaOpcao() {// inicio do metodo
		boolean valido = true;
		int opcao;
		while (valido) {// inicio do while
			try {// inicio do try
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog(
										null,
										"Informe a opçao: \n1 - Cadastrar Usuario \n2 - Listar nomes cadastrados\n3 - Listar nomes por ordem crescente\n4 - Excluir nome\n5 - Pesquisar por Nome\n6 - Sair"));

				switch (opcao) {// inicio do switch
				case 1:
					cadastrarUsuarios();
					break;
				case 2:
					listarNomes();

					break;
				case 3:
					ordenaNomes();
					break;
				case 4:
					excluirNome();
					break;
				case 5:
					pesquisaNome();
					break;
				case 6:
					System.exit(0);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
					break;

				}// fim do switch

			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Valor invalido");
			}// fim do try

		}// fim do while
	}// fim do metodo

	public void cadastrarUsuarios() {
		for (int i = 1; i <= 10; i++) {
			boolean valido = true;
			while (valido) {
				try {
					elemento = JOptionPane.showInputDialog("Informe o nome");
					if (!Valida.verificaStringVazio(elemento)) {
						lista.add(elemento);
						JOptionPane.showMessageDialog(null,
								"Usuarios cadastrados com sucesso");

						valido = false;
					} else {
						JOptionPane.showMessageDialog(null,
								"Informe um nome valido");
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Informe valor valido");
				}
			}
		}

	}

	public void listarNomes() {
		String painel = "";
		int aux = 1;
		for (String string : lista) {
			painel += aux + "- " + string + "\n";
			aux++;
		}
		JOptionPane.showMessageDialog(null, painel);
	}

	public void ordenaNomes() {
		Collections.sort(lista);
		listarNomes();
	}

	public void excluirNome() {

		boolean valido = true;
		while (valido) {
			try {
				elemento = JOptionPane.showInputDialog("Informe o nome");
				if (!Valida.verificaStringVazio(elemento)) {
					if (lista.contains(elemento)) {
						lista.remove(elemento);
					}
					JOptionPane.showMessageDialog(null,
							"Usuarios deletado com sucesso");

					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"Informe um nome valido");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe valor valido");
			}
		}

	}

	public void pesquisaNome() {
		String nome, mensagem = "";
		boolean valido = true;
		int aux = 1;

		while (valido) {
			nome = JOptionPane.showInputDialog("Informe o nome");
			if (!Valida.verificaStringVazio(nome)) {
				for (String string : lista) {

					if (string.contains(nome)) {
						mensagem += aux + " - " + string + "\n";

						aux++;
						valido = false;
					}
				}
				JOptionPane.showMessageDialog(null, mensagem);
			} else {
				JOptionPane.showMessageDialog(null, "Informe um nome valido");
			}

		}

	}

	public static void main(String[] args) {
		new VerificaArrayList();
	}
}
