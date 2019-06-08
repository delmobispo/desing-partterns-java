package builder;

public class ItemBuilder {
	
	private double valor;
	private String nome;

	public ItemBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Item constroi() {
		return new Item(nome, valor);
	}

}
