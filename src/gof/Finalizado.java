package gof;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado. Não aplica desconto!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser aprovados.");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser reprovados.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado.");
	}

}
