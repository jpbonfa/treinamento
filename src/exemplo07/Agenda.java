package exemplo07;

import javax.swing.JOptionPane;

public class Agenda {

	public Contato contatos[] = new Contato[10];

	public int opcao;
	public int exit;
	public int idade;
	public String nome, email;

	public void processar(int opcao) {
		switch (opcao) {
		case 1:
			processarCadastrar();
			break;
		case 2:
			processarConsultar();
			break;
		case 3:
			processarExcluir();
			break;

		}
	}

	public void escolhaOpcao() {
		boolean valido = true;
		while (valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a opção \n 1- cadastrar \n 2- consultar \n 3- excluir \n 9- sair"));
				switch (opcao) {
				case 1:
					processar(1);
					break;
				case 2:
					processar(2);
					break;
				case 3:
					processar(3);
					break;
				case 9:
					exit = JOptionPane.showConfirmDialog(null,
							"deseja sair de sua agenda?", "Atenção!",
							JOptionPane.YES_NO_OPTION);
					if (exit == 0) {
						valido = false;

					}
					break;

				default:
					JOptionPane.showMessageDialog(null, "opção indisponivel");

					break;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "opção indisponivel");

			}
		}
	}

	public void processarCadastrar() {
		informeNome();
		informeEmail();
		informeIdade();
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setIdade(idade);
		cadastrar(contato);
	}

	public void processarConsultar() {
		informeNome();
		Contato contato = consultar(nome);
		if (contato != null) {
			System.out.println("nome do contato: " + contato.getNome());
			System.out.println("email do contato: " + contato.getEmail());
			System.out.println("idade do contato: " + contato.getIdade());

		} else {
			JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
		}
	}

	public void processarExcluir() {
		informeNome();
		excluir(nome);

	}

	public void informeNome() {

		nome = JOptionPane.showInputDialog("insira o nome do contato");

	}

	public void informeEmail() {
		boolean valido = false;

		while (!valido) {
			email = JOptionPane.showInputDialog("insira o email do contato");
			valido = validaEmail(email);
			if (!valido) {
				JOptionPane.showMessageDialog(null, "email invalido");
			}
		}

	}

	public void informeIdade() {
		boolean valido = true;

		while (valido) {
			try {
				idade = Integer.parseInt(JOptionPane
						.showInputDialog("insira a idade do contato: "));
				if (idade > 0) {
					valido = false;
				}

			} catch (Exception erro) {

				JOptionPane.showMessageDialog(null, "informe um valor valido");
			}
		}
	}

	public boolean validaEmail(String email) {
		int index = email.indexOf("@");
		if (index > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void cadastrar(Contato contato) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato;
				JOptionPane
						.showMessageDialog(null, "contato salvo com sucesso");
				break;
			}
		}
	}

	public Contato consultar(String nome) {
		Contato contato = null;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getNome().equals(nome)) {
				contato = contatos[i];
				break;
			}
		}

		return contato;
	}

	public void excluir(String nome) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i].getNome().equals(nome)) {
				contatos[i] = null;
				JOptionPane.showMessageDialog(null,
						"contato excluido com sucesso");
				break;

			}

		}
	}

}
