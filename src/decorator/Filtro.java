package decorator;

import java.util.Collections;
import java.util.List;

public abstract class Filtro {
	
	protected final Filtro outroFiltro;
	
	public Filtro() {
		outroFiltro = null;
	}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximo(List<Conta> contas){
		if(outroFiltro == null)
			return Collections.emptyList();
		return outroFiltro.filtra(contas);
	}

}
