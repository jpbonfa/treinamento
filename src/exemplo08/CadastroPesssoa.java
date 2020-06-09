package exemplo08;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class CadastroPesssoa {

	public Pessoa pessoas[];

	public int tamanho;
	public int opcao;

	public String nome;
	public int dia, mes, ano;
	public int idade;
	public int mesAniver;

	public CadastroPesssoa() {
		tamanho();
		escolhaOpcao();
	}

	public void tamanho() {
		boolean valido = true;
		while (valido) {
			try {
				tamanho = Integer.parseInt(JOptionPane
						.showInputDialog("insira um tamanho de vetor"));
				if (tamanho > 0) {
					valido = false;
					pessoas = new Pessoa[tamanho];
				} else {
					JOptionPane.showMessageDialog(null,
							"insira um tamanho valido");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "tamanho invalido");
			}

		}
	}

	public void escolhaOpcao() {
		boolean valido = true;
		while (valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe a opção \n 1- cadastrar \n 2- listar todos  \n 3- listar maior de idade \n 4- listar maior de idade \n 5- listar aniversariante \n 9- sair"));

				switch (opcao) {
				case 1:
					cadastrarPessoa();
					break;
				case 2:
					listarPessoas();
					break;
				case 3:
					listarMaiorIdade();
					break;
				case 4:
					listarMenorIdade();
					break;
				case 5:
					listarAniversariante();
					break;

				case 9:
					valido = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "opção invalida");
					break;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "opção invalida");

			}
		}
	}

	public void cadastrarPessoa() {
		informeNome();
		informeDataNascimento();
		calculaIdade();
		gravaPessoa();

	}

	public void informeNome() {
		boolean valido = true;
		while (valido) {

			nome = JOptionPane.showInputDialog("informe o nome da pessoa");

			if (nome.trim().equals("")) {
				JOptionPane.showMessageDialog(null,
						"informe um nome, campo obrigatorio");
			} else {
				valido = false;
			}

		}

	}

	public void informeDataNascimento() {
		informeDia();
		informeMes();
		informeAno();
	}

	public void informeDia() {
		boolean valido = true;
		while (valido) {
			try {
				dia = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe o dia em que a pessoa nasceu: "));
				if (dia == 0 || dia > 31) {
					JOptionPane
							.showMessageDialog(null, "informe um dia valido");

				} else {
					valido = false;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "informe um dia valido");
			}
		}
	}

	public void informeMes() {
		boolean valido = true;
		while (valido) {
			try {
				mes = Integer.parseInt(JOptionPane
						.showInputDialog("informe o mes de nascimento: "));
				if (mes > 0 && mes <= 12) {
					valido = false;
				} else {
					JOptionPane
							.showMessageDialog(null, "informe um mes valido");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "informe um mes valido :");
			}
		}
	}

	public void informeAno() {
		boolean valido = true;
		while (valido) {
			ano = Integer.parseInt(JOptionPane
					.showInputDialog("informe o ano de nascimento: "));
			if (ano < 1500) {
				JOptionPane.showMessageDialog(null, "informe um ano valido :");

			} else {
				valido = false;
			}
		}
	}

	public void calculaIdade() {
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		idade = anoAtual - ano;
	}

	public void gravaPessoa() {
		Data dataNascimento = new Data();
		dataNascimento.setDia(dia);
		dataNascimento.setMes(mes);
		dataNascimento.setAno(ano);

		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		pessoa.setDataNascimento(dataNascimento);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null) {
				pessoas[i] = pessoa;
				JOptionPane.showMessageDialog(null,
						"pessoa cadastrada com sucesso");
				break;
			}
		}
	}

	public void listarPessoas() {
		for (Pessoa p : pessoas) {
			if (p != null) {
				System.out.println("Nome da pessoa: " + p.getNome());
				System.out.println("idade da pessoa: " + p.getIdade());
				System.out.println("data de nascimento da pessoa: "
						+ p.getDataNascimento());
				System.out.println("");
			}

		}
	}

	public void listarMaiorIdade() {
		for (Pessoa p : pessoas) {
			if (p.getIdade() >= 18 && p != null) {
				System.out.println("Nome da pessoa: " + p.getNome());
				System.out.println("idade da pessoa: " + p.getIdade());
				System.out.println("data de nascimento da pessoa: "
						+ p.getDataNascimento());
				System.out.println("");
			}

		}

	}

	public void listarMenorIdade() {
		for (Pessoa p : pessoas) {
			if (p.getIdade() < 18) {
				System.out.println("Nome da pessoa: " + p.getNome());
				System.out.println("idade da pessoa: " + p.getIdade());
				System.out.println("data de nascimento da pessoa: "
						+ p.getDataNascimento());
				System.out.println("");
			}

		}

	}

	public void listarAniversariante() {
		boolean valido = true;
		while (valido) {
			try {
				mesAniver = Integer.parseInt(JOptionPane
						.showInputDialog("insira um mes "));
				if (mesAniver < 13) {
					System.out.println("aniversariantes do mes");

					for (Pessoa p : pessoas) {
						if (p.getDataNascimento().getMes() == mesAniver) {

							System.out
									.println("Nome da pessoa: " + p.getNome());
							System.out.println("idade da pessoa: "
									+ p.getIdade());
							System.out.println("data de nascimento da pessoa: "
									+ p.getDataNascimento());
							System.out.println("");
							valido = false;
						}
					}

				}
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "insira um mes existente");
			}

		}

	}
}
