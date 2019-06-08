package strategy;

public class Conservador implements Investimento {

	@Override
	public double executa(ContaBancaria conta) {
		return conta.getSaldo() * 0.008;
	}

}
