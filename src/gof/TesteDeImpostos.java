package gof;


public class TesteDeImpostos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iss);
		
	}
}
