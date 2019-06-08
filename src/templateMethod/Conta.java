package templateMethod;

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


}
