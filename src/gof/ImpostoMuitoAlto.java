package gof;

public class ImpostoMuitoAlto extends Imposto{
	
	public ImpostoMuitoAlto() {
		super();
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}

	
}
