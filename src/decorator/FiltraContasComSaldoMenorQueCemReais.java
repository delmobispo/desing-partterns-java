package decorator;

import java.util.List;
import java.util.stream.Collectors;

public class FiltraContasComSaldoMenorQueCemReais extends Filtro {
	
	public FiltraContasComSaldoMenorQueCemReais() {
		super();
	}
	
	public FiltraContasComSaldoMenorQueCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(
			c -> c.getSaldo() < 100)
				.collect(Collectors.toList());
		filtradas.addAll(proximo(contas));
		return filtradas;
	}

}
