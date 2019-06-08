package state;

public class Negativo implements EstadoConta{
	
	private Conta conta;
	
	public Negativo(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void deposita(double valor) {
		conta.lanca(valor * 0.95);
	}

	@Override
	public void saca(double valor) {
		throw new RuntimeException("Não é possível sacar um conta que está negativa.");
	}

}
