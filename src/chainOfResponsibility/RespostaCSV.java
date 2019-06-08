package chainOfResponsibility;

public class RespostaCSV implements Resposta {
	
	private Resposta resposta;

	public RespostaCSV(Resposta resposta) {
		setProxima(resposta);
	}

	@Override
	public String resposta(Requisicao requisicao, Conta conta) {
		if(Formato.CSV.equals(requisicao.getFormato())) {
			return String.format("%s;%s", conta.getNome(), conta.getSaldo());
		}
		return resposta.resposta(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
