package chainOfResponsibility;

public class Conta {
	
	private String nome;
	private double saldo;

	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
	}

}
