package templateMethod;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		contas.forEach(c -> System.out.println(c.getNome() + " - " + c.getSaldo()));
	}

}
