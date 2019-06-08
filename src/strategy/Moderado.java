package strategy;

import java.util.Random;

public class Moderado implements Investimento {
	
	private Random random;
	
	public Moderado() {
		random = new Random();
	}

	@Override
	public double executa(ContaBancaria conta) {
		if(random.nextInt(2) == 0) {
			return conta.getSaldo() * 0.25;
		}
		return conta.getSaldo() * 0.007;
	}

}
