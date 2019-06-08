package interpreter;

public class Subtracao implements Expressao{

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() - direita.avalia();
	}
}
