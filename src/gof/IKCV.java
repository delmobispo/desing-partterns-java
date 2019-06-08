package gof;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV() {
		super();
	}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
		return orcamento.getItens().stream().anyMatch(i -> i.getValor() > 100);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQueCemReais(orcamento);
	}

}
