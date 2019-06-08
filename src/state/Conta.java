package state;

public class Conta {

	private double saldo;
	
	private EstadoConta estado;

	public Conta(double saldo) {
		setEstado(saldo);
		this.saldo = saldo;
	}

	private void setEstado(double saldo) {
		if(saldo >= 0)
			estado = new Positivo(this);
		else
			estado = new Negativo(this);
	}
	
	public double getSaldo() {
		return saldo;
	}

	protected void lanca(double valor) {
		setEstado(saldo);
		saldo += valor;
	}
	
	public void deposita(double valor) {
		estado.deposita(valor);
	}
	
	public void saca(double valor) {
		estado.saca(valor);
	}
	
}
