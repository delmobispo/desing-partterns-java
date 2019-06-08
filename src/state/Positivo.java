package state;

public class Positivo implements EstadoConta {
	
	private Conta conta;
	
	public Positivo(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void deposita(double valor) {
		conta.lanca(valor * 0.98);
	}

	@Override
	public void saca(double valor) {
		conta.lanca(valor * -1);
	}

}
