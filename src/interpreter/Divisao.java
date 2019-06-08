package interpreter;

public class Divisao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direta;

	public Divisao(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() / direta.avalia();
	}

}
