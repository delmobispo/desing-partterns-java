package interpreter;

public class Multiplicacao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direta;

	public Multiplicacao(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() * direta.avalia();
	}

}
