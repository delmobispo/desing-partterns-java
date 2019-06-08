package gof;


public class ICMS extends Imposto{
	
	public ICMS() {
		super();
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
