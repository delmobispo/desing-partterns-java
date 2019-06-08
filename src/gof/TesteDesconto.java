package gof;

public class TesteDesconto {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionaItem(new Item("LAPIS", 12));
		orcamento.adicionaItem(new Item("Caneta", 130));
		System.out.println(descontos.calcula(orcamento));
	}
}
