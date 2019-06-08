package adapter;

public class TesteAdapter {
	
	public static void main(String[] args) {
		Relogio rel = new RelogioSistema();
		
		System.out.println(rel.hoje());
	}

}
