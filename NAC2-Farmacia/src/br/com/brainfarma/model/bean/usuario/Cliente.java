package br.com.brainfarma.model.bean.usuario;

public class Cliente extends Associado {

	private boolean desejaReceberOfertas;

	public Cliente() {

	}

	public Cliente(boolean desejaReceberOfertas) {
		super();
		this.desejaReceberOfertas = desejaReceberOfertas;
	}

	// Imprimir usu�rios
	@Override
	public String toString() {
		return "= = = = = = = = = = = = \n" + super.toString();

	}

	public void receberOfertasEmail(boolean ofertasEmail) {
		this.desejaReceberOfertas = ofertasEmail;
		if (!ofertasEmail) {
			System.out.println("Ofertas por e-mail desativadas.");
		}
	}

	public boolean isDesejaReceberOfertas() {
		return desejaReceberOfertas;
	}

	public void setDesejaReceberOfertas(boolean desejaReceberOfertas) {
		this.desejaReceberOfertas = desejaReceberOfertas;
	}

}