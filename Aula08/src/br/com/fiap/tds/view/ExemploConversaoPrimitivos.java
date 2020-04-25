package br.com.fiap.tds.view;

public class ExemploConversaoPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String idade = "19";

		byte idadeByte = Byte.parseByte(idade);
		short idadeShort = Short.parseShort(idade);
		int idadeInt = Integer.parseInt(idade);
		long idadeLong = Long.parseLong(idade);
		double idadeDouble = Double.parseDouble(idade);
		float idadeFloat = Float.parseFloat(idade);
		boolean idadeBoolean = Boolean.parseBoolean(idade);

		double soma = idadeByte + idadeShort + idadeInt + idadeLong + idadeDouble + idadeFloat;
		System.out.println(soma);
		System.out.println(idadeBoolean);
	}

}
