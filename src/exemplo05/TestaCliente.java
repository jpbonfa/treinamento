package exemplo05;

import javax.swing.JOptionPane;

public class TestaCliente {

	public void verificaSexo(Cliente cliente) {
		if (cliente.getSexo() == 'M') {
			System.out.println("o cliente é benino");
		} else {
			System.out.println("o cliente é benina");
		}

	}

	public void exibirDados(Cliente cliente) {
		System.out.println("nome do cliente: " + cliente.getNome());
		System.out.println("idade do cliente: " + cliente.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente.getLimite());

	}


	public void listarClientes(Cliente cliente1, Cliente cliente2,
			Cliente cliente3, Cliente cliente4, Cliente cliente5) {
		System.out.println("nome do cliente: " + cliente1.getNome());
		System.out.println("idade do cliente: " + cliente1.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente1.getLimite());
		verificaSexo(cliente1);
		System.out.println("");
		System.out.println("nome do cliente: " + cliente2.getNome());
		System.out.println("idade do cliente: " + cliente2.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente2.getLimite());
		verificaSexo(cliente2);
		System.out.println("");
		System.out.println("nome do cliente: " + cliente3.getNome());
		System.out.println("idade do cliente: " + cliente3.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente3.getLimite());
		verificaSexo(cliente3);
		System.out.println("");
		System.out.println("nome do cliente: " + cliente4.getNome());
		System.out.println("idade do cliente: " + cliente4.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente4.getLimite());
		verificaSexo(cliente4);
		System.out.println("");
		System.out.println("nome do cliente: " + cliente5.getNome());
		System.out.println("idade do cliente: " + cliente5.getIdade());
		System.out.println("limite de compra do cliente: "
				+ cliente5.getLimite());
		verificaSexo(cliente5);

	}

	public void processarUnitario() {

		Cliente c1 = new Cliente();
		c1.setNome("Joao");
		c1.setIdade(15);
		c1.setSexo('M');
		c1.setLimite(10229.00);

		Cliente c2 = new Cliente();
		c2.setNome("kleber");
		c2.setIdade(22);
		c2.setSexo('M');
		c2.setLimite(109.00);

		Cliente c3 = new Cliente();
		c3.setNome("Ana");
		c3.setIdade(22);
		c3.setSexo('f');
		c3.setLimite(122.00);

		Cliente c4 = new Cliente();
		c4.setNome("Isa");
		c4.setIdade(22);
		c4.setSexo('f');
		c4.setLimite(129.00);

		Cliente c5 = new Cliente();
		c5.setNome("Maria");
		c5.setIdade(22);
		c5.setSexo('f');
		c5.setLimite(19.00);

		boolean valido = false;
		int opcao = 0;

		while (!valido) {
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog("informe o cliente: \n 1- cliente \n 2- cliente \n 3- cliente \n 4- cliente \n 5- cliente \n 6 - listar clientes"));
				valido = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "informe um valor valido");
			}

			switch (opcao) {
			case 1:
				verificaSexo(c1);
				break;
			case 2:
				verificaSexo(c2);
				break;
			case 3:
				verificaSexo(c3);
				break;
			case 4:
				verificaSexo(c4);
				break;
			case 5:
				verificaSexo(c5);
				break;
			case 6:
				listarClientes(c1, c2, c3, c4, c5);

				break;

			default:
				JOptionPane.showMessageDialog(null, "opção inavalida");
				break;
			}
		}

	}

	public static void main(String[] args) {
		new TestaCliente().processarUnitario();
	}
}
