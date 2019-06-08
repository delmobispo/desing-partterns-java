package observer;

import builder.Item;

public class TesteNotaAcoesAposGeracao {
	public static void main(String[] args) {
		new NotaFiscalBuilder().comCnpj("123.456.789/0001-10")
	     .comItem(new Item("item 1", 100.0))
	     .comItem(new Item("item 2", 200.0))
	     .comItem(new Item("item 3", 300.0))
	     .comObservacoes("entregar notaFiscal pessoalmente")
	     .naDataAtual()
	     .adicionaAcao(new Multiplicador(2))
	     .adicionaAcao(new Multiplicador(3))
	     .adicionaAcao(new Multiplicador(10))
	     .constroi();	
	}
}
