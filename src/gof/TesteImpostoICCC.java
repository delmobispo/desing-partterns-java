package gof;


public class TesteImpostoICCC {
	
	public static void main(String[] args) {
		
		Imposto iccc = new ICCC();
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		
		Orcamento orcamentoMenorQue1000 = new Orcamento(100);
		calculadora.realizaCalculo(orcamentoMenorQue1000, iccc);
		
		Orcamento orcamentoEntre1000E3000 = new Orcamento(2000);
		calculadora.realizaCalculo(orcamentoEntre1000E3000, iccc);
		
		Orcamento orcamentoMaiorQue3000 = new Orcamento(4000);
		calculadora.realizaCalculo(orcamentoMaiorQue3000, iccc);
	}

}
