package gof;


public class ICCC extends Imposto{
	
	public ICCC() {
		super();
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1.000) {
			return orcamento.getValor() * 0.05;
		}
		
		if(orcamento.getValor() >= 1.000 && orcamento.getValor() <= 3.000) {
			return  orcamento.getValor() * 0.07;
		}
		
		if(orcamento.getValor() > 3.000) {
			return orcamento.getValor() * 0.08 + 30; 
		}
		
		return 0;
	}

}
