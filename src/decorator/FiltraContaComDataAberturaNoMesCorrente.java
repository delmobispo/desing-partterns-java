package decorator;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltraContaComDataAberturaNoMesCorrente extends Filtro{
	
	public FiltraContaComDataAberturaNoMesCorrente() {
		super();
	}
	
	public FiltraContaComDataAberturaNoMesCorrente(Filtro outoFiltro) {
		super(outoFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(
				c -> dadoQueMesmoMesEAnoCorrente(c.getDataAbertura()))
					.collect(Collectors.toList());
		filtradas.addAll(proximo(contas));
		return filtradas;
	}
	
	private boolean dadoQueMesmoMesEAnoCorrente(LocalDate data) {
		LocalDate hoje = LocalDate.now();
		return data.getMonthValue() == hoje.getMonthValue() &&
				data.getYear() == hoje.getYear();
	}

}
