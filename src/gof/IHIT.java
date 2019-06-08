package gof;

public class IHIT extends TemplateDeImpostoCondicional{
	
	public IHIT() {
		super();
	}
	
	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getQtdItens();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return getQtdItemMesmoNome(orcamento) >= 2;
	}
	
	private int getQtdItemMesmoNome(Orcamento orcamento) {
		int qtd = 0;
		for(Item item : orcamento.getItens()) {
			if(orcamento.contemItemDeNome(item.getNome())) {
				qtd++;
			}
		}
		return qtd;
	}

}
