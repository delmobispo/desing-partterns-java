package chainOfResponsibility;

public class RespostaXML implements Resposta{

	private Resposta resposta;

	public RespostaXML(Resposta resposta) {
		setProxima(resposta);
	}

	@Override
	public String resposta(Requisicao requisicao, Conta conta) {
		if(Formato.XML.equals(requisicao.getFormato()))
			return String.format(
				"<conta><titular>%s</titular><saldo>%s</saldo></conta>",
				conta.getNome(), conta.getSaldo());
		return resposta.resposta(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}
	
	
}
