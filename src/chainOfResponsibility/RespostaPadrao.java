package chainOfResponsibility;

public class RespostaPadrao implements Resposta {
	
	@Override
	public String resposta(Requisicao requisicao, Conta conta) {
		return conta.toString();
	}

	@Override
	@Deprecated
	public void setProxima(Resposta resposta) {
	}

	
}
