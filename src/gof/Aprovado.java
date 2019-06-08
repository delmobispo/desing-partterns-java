package gof;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoAplicado) {
			throw new RuntimeException("Desconto de aprovação já aplicado.");
		}
		orcamento.desconto(0.02);
		descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está aprovado.");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
