package gof;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado! Desconto não aplicável");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de reprovação!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
