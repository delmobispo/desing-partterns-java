package strategy;

public class TesteInvestimento {
	public static void main(String[] args) {
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimentos realiza = new RealizadorDeInvestimentos();
		
		ContaBancaria contaJose = new ContaBancaria(100);
		realiza.realizar(conservador, contaJose);
		
		ContaBancaria contaJosefa = new ContaBancaria(100);
		realiza.realizar(moderado, contaJosefa);

		ContaBancaria contaFarias = new ContaBancaria(100);
		realiza.realizar(arrojado, contaFarias);

	}
}
