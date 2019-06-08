package chainOfResponsibility;

public interface Resposta {
	String resposta(Requisicao requisicao, Conta conta);
	void setProxima(Resposta resposta);
}
