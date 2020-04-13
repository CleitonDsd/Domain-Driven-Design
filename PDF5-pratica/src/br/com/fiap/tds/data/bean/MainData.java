package br.com.fiap.tds.data.bean;

public class MainData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data();

		data.lerDia();
		data.validarDia(data.getDia());

		data.lerMes();
		data.validarMes(data.getMes());
		data.retornarNomeMes(data.getMes());
		
		data.lerAno();
		data.validarAno(data.getAno());

		System.out.println(data.retornarData());
	}

}
