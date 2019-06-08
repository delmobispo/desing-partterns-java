package singleton;

public class Servico {
	
	public static final Servico INSTANCE;
	
	static {
		INSTANCE = new Servico();
	}
}
