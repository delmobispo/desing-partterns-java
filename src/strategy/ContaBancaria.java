package strategy;

public class ContaBancaria {
	
	private double saldo;

	public ContaBancaria(double saldo) {
		deposita(saldo);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
