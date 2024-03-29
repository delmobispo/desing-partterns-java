package interpreter;

public class RaizQuadrada implements Expressao {

	private Expressao numero;

	public RaizQuadrada(Expressao numero) {
		this.numero = numero;
	}
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(numero.avalia());
	}

}
