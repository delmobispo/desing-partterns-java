package gof;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        NotaFiscal nf = builder.paraEmpresa("Caelum")
        .comCnpj("123.456.789/0001-10")
        .comItem(new Item("item 1", 100.0))
        .comItem(new Item("item 2", 200.0))
        .comItem(new Item("item 3", 300.0))
        .comObservacoes("entregar nf pessoalmente")
        .naDataAtual()
        .constroi();
        
        System.out.println(nf.getValorBruto());
	}

}
