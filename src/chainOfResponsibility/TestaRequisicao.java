package chainOfResponsibility;

public class TestaRequisicao {
	
	public static void main(String[] args) {
		Conta conta = new Conta("Delmo", 4000);
		
		RespondeRequisicao responde = new RespondeRequisicao();

		Requisicao requisicaoXml = new Requisicao(Formato.XML);
		responde.executa(requisicaoXml, conta);
		
		Requisicao requisicaoCsv = new Requisicao(Formato.CSV);
		responde.executa(requisicaoCsv, conta);
		
		Requisicao requisicaoPorcentagem = new Requisicao(Formato.PORCENTO);
		responde.executa(requisicaoPorcentagem, conta);
		
		Requisicao requisicaoPadrao = new Requisicao(null);
		responde.executa(requisicaoPadrao, conta);
	}

}
