package visitor;

public class RaizQuadrada implements Expressao {

	private Expressao numero;

	public RaizQuadrada(Expressao numero) {
		this.numero = numero;
	}
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(numero.avalia());
	}
	
	public Expressao getNumero() {
		return numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}
}
