package gof;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoAplicado) {
			throw new RuntimeException("Desconto de em aprovação já aplicado");
		}
		orcamento.desconto(0.05);
		descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados.");
	}

}
