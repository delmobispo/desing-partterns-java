package gof;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	@Deprecated
	public void setProximo(Desconto proximo) {
		
	}

}
