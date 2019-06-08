package flyweight;

public enum NotaMusical {
	DO(new Do()), 
	RE(new Re()), 
	MI(new Mi()), 
	FA(new Fa()), 
	SOL(new Sol()), 
	LA(new La()), 
	SI(new Si()),
	DO_SUSTENIDO(new DoSustenido()), 
	RE_SUSTENIDO(new ReSustenido()), 
	MI_SUSTENIDO(new MiSustenido()), 
	FA_SUSTENIDO(new FaSustenido()), 
	SOL_SUSTENIDO(new SolSustenido()), 
	LA_SUSTENIDO(new LaSustenido()), 
	SI_SUSTENIDO(new SiSustenido());
	
	private Nota nota;
	
	private NotaMusical(Nota nota) {
		this.nota = nota;
	}
	
	public Nota get() {
		return nota;
	}
}
