package decorator;

import java.util.List;
import java.util.stream.Collectors;

public class FiltraContasComSaldoMaiorQueQuinhentosMilReais extends Filtro {
	
	public FiltraContasComSaldoMaiorQueQuinhentosMilReais() {
		super();
	}
	
	public FiltraContasComSaldoMaiorQueQuinhentosMilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(
				c -> c.getSaldo() > 500000)
					.collect(Collectors.toList());
		filtradas.addAll(proximo(contas));
		return filtradas;
	}

}
