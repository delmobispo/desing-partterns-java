package gof;

public class TesteDeImpostoComplexo {
	public static void main(String[] args) {
		Imposto impostoComplexo = new ImpostoMuitoAlto(new ISS(new ICMS(new ICCC())));

        Orcamento orcamento = new Orcamento(500.0);

        double valor = impostoComplexo.calcula(orcamento);

        System.out.println(valor);
	}
}
