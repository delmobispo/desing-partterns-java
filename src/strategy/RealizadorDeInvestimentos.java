package strategy;

public class RealizadorDeInvestimentos {
	
	public void realizar(Investimento estrategia, ContaBancaria conta) {
		double valor = estrategia.executa(conta);
		conta.deposita(valor * 0.75);
		System.out.println(conta.getSaldo());
	}

}
