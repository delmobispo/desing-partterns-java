package interpreter;

public class TesteExpressao {

	public static void main(String[] args) {
		// "(2+3)-4/2"
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao conta = new Soma(esquerda, direita);
		int resultado = conta.avalia();
		System.out.println(resultado);
	}

}
