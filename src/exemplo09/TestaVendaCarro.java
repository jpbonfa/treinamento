package exemplo09;

public class TestaVendaCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Marca marca1 = new Marca();
		Marca marca2 = new Marca();
		Marca marca3 = new Marca();
		Marca marca4 = new Marca();
		Marca marca5 = new Marca();
		marca1.setNome("Audi");
		marca2.setNome("Fiat");
		marca3.setNome("Chevrolet");
		marca4.setNome("Ferrari");
		marca5.setNome("Ford");

		Modelo modelo1 = new Modelo();
		Modelo modelo2 = new Modelo();
		Modelo modelo3 = new Modelo();
		Modelo modelo4 = new Modelo();
		Modelo modelo5 = new Modelo();
		Modelo modelo6 = new Modelo();
		Modelo modelo7 = new Modelo();
		Modelo modelo8 = new Modelo();
		Modelo modelo9 = new Modelo();
		Modelo modelo10 = new Modelo();
		modelo1.setMarca(marca1);
		modelo1.setNome("TT");
		modelo2.setMarca(marca1);
		modelo2.setNome("A3");
		modelo3.setMarca(marca2);
		modelo3.setNome("Uno");
		modelo4.setMarca(marca2);
		modelo4.setNome("Argo");
		modelo5.setMarca(marca3);
		modelo5.setNome("Onix");
		modelo6.setMarca(marca3);
		modelo6.setNome("Cruze");
		modelo7.setMarca(marca4);
		modelo7.setNome("Spider");
		modelo8.setMarca(marca4);
		modelo8.setNome("California");
		modelo9.setMarca(marca5);
		modelo9.setNome("Fusion");
		modelo10.setMarca(marca5);
		modelo10.setNome("Fiesta");

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		Carro carro6 = new Carro();
		Carro carro7 = new Carro();
		Carro carro8 = new Carro();
		Carro carro9 = new Carro();
		Carro carro10 = new Carro();

		carro1.setModelo(modelo1);
		carro1.setPlaca("BKJ-5478");
		carro1.setCombustivel("GASOLINA");// GASOLINA - ETANOL - DIESEL - FLEX
		carro1.setVelocidadeMaxima(320);
		carro1.setValor(300000.0);
		carro1.setDesconto(10000.0);
		carro1.setDisponivel(true);
		carro1.setPromoçao(true);
		carro1.setValorPromocao(280000.0);

		carro2.setModelo(modelo2);
		carro2.setPlaca("MCK-3457");
		carro2.setCombustivel("GASOLINA");
		carro2.setVelocidadeMaxima(220);
		carro2.setValor(180000.0);
		carro2.setDesconto(15000.0);
		carro2.setDisponivel(true);
		carro2.setPromoçao(true);
		carro2.setValorPromocao(160000.0);

		carro3.setModelo(modelo3);
		carro3.setPlaca("UNO-1234");
		carro3.setCombustivel("GASOLINA");
		carro3.setVelocidadeMaxima(620);
		carro3.setValor(3000000.0);
		carro3.setDesconto(100.0);
		carro3.setDisponivel(true);
		carro3.setPromoçao(false);
		carro3.setValorPromocao(5000.0);

		carro4.setModelo(modelo4);
		carro4.setPlaca("NSX-5968");
		carro4.setCombustivel("FLEX");
		carro4.setVelocidadeMaxima(220);
		carro4.setValor(40000.0);
		carro4.setDesconto(10000.0);
		carro4.setDisponivel(true);
		carro4.setPromoçao(true);
		carro4.setValorPromocao(280000.0);

		carro5.setModelo(modelo5);
		carro5.setPlaca("YFU-5128");
		carro5.setCombustivel("GASOLINA");
		carro5.setVelocidadeMaxima(220);
		carro5.setValor(38000.0);
		carro5.setDesconto(43300.0);
		carro5.setDisponivel(true);
		carro5.setPromoçao(true);
		carro5.setValorPromocao(35000.0);

		carro6.setModelo(modelo6);
		carro6.setPlaca("KCY-5324");
		carro6.setCombustivel("GASOLINA");
		carro6.setVelocidadeMaxima(180);
		carro6.setValor(50000.0);
		carro6.setDesconto(1.0);
		carro6.setDisponivel(true);
		carro6.setPromoçao(false);
		carro6.setValorPromocao(40000.0);

		carro7.setModelo(modelo7);
		carro7.setPlaca("SPC-0157");
		carro7.setCombustivel("GASOLINA");
		carro7.setVelocidadeMaxima(380);
		carro7.setValor(2000000.0);
		carro7.setDesconto(200000.0);
		carro7.setDisponivel(true);
		carro7.setPromoçao(false);
		carro7.setValorPromocao(180000.0);

		carro8.setModelo(modelo8);
		carro8.setPlaca("KLF-0420");
		carro8.setCombustivel("GASOLINA");
		carro8.setVelocidadeMaxima(320);
		carro8.setValor(300000.0);
		carro8.setDesconto(10000.0);
		carro8.setDisponivel(true);
		carro8.setPromoçao(true);
		carro8.setValorPromocao(280000.0);

		carro9.setModelo(modelo9);
		carro9.setPlaca("HBD-2212");
		carro9.setCombustivel("HIBRIDO");// GASOLINA - ETANOL - DIESEL - FLEX
		carro9.setVelocidadeMaxima(195);
		carro9.setValor(180000.0);
		carro9.setDesconto(10000.0);
		carro9.setDisponivel(true);
		carro9.setPromoçao(true);
		carro9.setValorPromocao(150000.0);

		carro10.setModelo(modelo10);
		carro10.setPlaca("PTJ-5478");
		carro10.setCombustivel("ETANOL");// GASOLINA - ETANOL - DIESEL - FLEX
		carro10.setVelocidadeMaxima(180);
		carro10.setValor(45000.0);
		carro10.setDesconto(8000.0);
		carro10.setDisponivel(false);
		carro10.setPromoçao(true);
		carro10.setValorPromocao(38000.0);

		Carro estoque[] = new Carro[20];
		estoque[0] = carro1;
		estoque[1] = carro2;
		estoque[2] = carro3;
		estoque[3] = carro4;
		estoque[4] = carro5;
		estoque[5] = carro6;
		estoque[6] = carro7;
		estoque[7] = carro8;
		estoque[8] = carro9;
		estoque[9] = carro10;
		
		new VendaCarro(estoque);

	}

}
