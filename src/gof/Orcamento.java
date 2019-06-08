package gof;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	private final List<Item> itens;
	
	private EstadoDeUmOrcamento estado;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		setEstado(new EmAprovacao());
	}

	public double getValor() {
		return valor;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public boolean contemItemDeNome(String nome) {
		return getItens().stream().anyMatch(i -> i.getNome().equalsIgnoreCase(nome));
	}

	public int getQtdItens() {
		return getItens().size();
	}
	
	public void desconto(double porcentagem) {
		this.valor -= valor * porcentagem;
	}

	public void aplicaDescontoExtra() {
		estado.aplicaDescontoExtra(this);
	}

	public void setEstado(EstadoDeUmOrcamento estado) {
		this.estado = estado;
	}
	
	public void aprova() {
		estado.aprova(this);
	}
	
	public void reprova() {
		estado.reprova(this);
	}
	
	public void finaliza() {
		estado.finaliza(this);
	}

}
