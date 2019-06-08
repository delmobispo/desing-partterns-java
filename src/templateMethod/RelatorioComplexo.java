package templateMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
	}

	@Override
	protected void corpo(List<Conta> contas) {
		contas.forEach(c -> System.out.println(c.getNome() + " | " + c.getSaldo()));

	}

}
