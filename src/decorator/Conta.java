package decorator;

import java.time.LocalDate;

public class Conta {
	
	private double saldo;
	
	private LocalDate dataAbertura;
	
	public Conta(double saldo, LocalDate dataAbertura) {
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

}
