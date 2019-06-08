package chainOfResponsibility;

public enum Formato {

	XML(new RespostaXML(null)),
	CSV(new RespostaCSV(null)),
	PORCENTO(new RespostaPorcentagem(null));
	
	private Resposta resposta;
	
	private Formato(Resposta resposta) {
		this.resposta = resposta;
	}
	
	public Resposta getResposta() {
		return resposta;
	}
}
