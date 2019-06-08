package singleton;

public class Conexao {
	
	private static Conexao instance; 
	
	private Conexao() {
		
	}
	
	public static Conexao getInstance() {
		if(instance == null) {
			instance = new Conexao();
		}
		return instance;
	}

}
