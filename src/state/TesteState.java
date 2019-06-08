package state;

public class TesteState {

	public static void main(String[] args) {
		Conta conta = new Conta(500);
		conta.deposita(100);
		conta.saca(500);
		conta.saca(100);
		conta.deposita(1);
		conta.saca(100);
		System.out.println(conta.getSaldo());
	}
}
