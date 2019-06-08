package chainOfResponsibility;

public class RespondeRequisicao {

	public void executa(Requisicao requisicao, Conta conta) {
		Resposta padrao = new RespostaPadrao();
		Resposta porcento = new RespostaPorcentagem(padrao);
		Resposta csv = new RespostaCSV(porcento);
		Resposta xml = new RespostaXML(csv);
		
		System.out.println(xml.resposta(requisicao, conta));
	}
}
