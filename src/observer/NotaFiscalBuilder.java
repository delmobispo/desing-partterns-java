package observer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import builder.Item;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<Item> itens;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private LocalDate dataEmissao;
	private List<AcaoAposGerarNota> acoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
		itens = new ArrayList<Item>();
		acoesASeremExecutadas = new ArrayList<>();
	}
	
	public NotaFiscalBuilder adicionaAcao(AcaoAposGerarNota acao) {
		acoesASeremExecutadas.add(acao);
		return this;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(Item item) {
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		dataEmissao = LocalDate.now();
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
		
		acoesASeremExecutadas.forEach(acao -> acao.executa(notaFiscal));
		
		return notaFiscal;
	}
	

}
