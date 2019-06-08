package chainOfResponsibility;

public class RespostaPorcentagem implements Resposta {
	
	private Resposta resposta;

	public RespostaPorcentagem(Resposta resposta) {
		setProxima(resposta);
	}

	@Override
	public String resposta(Requisicao requisicao, Conta conta) {
		if(Formato.PORCENTO.equals(requisicao.getFormato())) {
			return conta.getNome() + "%" + conta.getSaldo(); 
		}
		return resposta.resposta(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
