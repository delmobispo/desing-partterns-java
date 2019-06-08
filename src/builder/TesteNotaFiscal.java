package builder;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        NotaFiscal nf = builder.paraEmpresa("Caelum")
        .comCnpj("123.456.789/0001-10")
        .comItem(new ItemBuilder().comNome("item 1").comValor(100.0).constroi())
        .comItem(new ItemBuilder().comNome("item 2").comValor(200.0).constroi())
        .comItem(new ItemBuilder().comNome("item 3").comValor(300.0).constroi())
        .comObservacoes("entregar nf pessoalmente")
        .constroi();
        
        System.out.println(nf.getValorBruto());
	}

}
