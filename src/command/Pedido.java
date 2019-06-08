package command;

import java.time.LocalDateTime;

public class Pedido {
	
	private String cliente;
	private double valor;
	private Status status;
	private LocalDateTime dataFinalizacao;

	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public void paga() {
		status = Status.PAGO;
	}
	
	public void finaliza() {
		dataFinalizacao = LocalDateTime.now();
		status = Status.ENTREGUE;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public LocalDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}

}
