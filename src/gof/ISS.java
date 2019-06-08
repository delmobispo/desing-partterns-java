package gof;


public class ISS extends Imposto{

	public ISS() {
		super();
	}
	
	public ISS(ICMS icms) {
		super(icms);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
