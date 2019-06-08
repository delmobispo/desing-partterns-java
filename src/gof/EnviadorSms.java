package gof;

public class EnviadorSms implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviando SMS");
	}

}
