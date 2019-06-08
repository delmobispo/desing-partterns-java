package bridge;

public class TesteBridge {
	
	public static void main(String[] args) {
		Mapa google = new MapaGoogle();
		System.out.println(google.get("Rua Vergueiro, 3185"));
		
		Mapa link = new MapaLink();
		System.out.println(link.get("Rua Vergueiro, 3185"));
	}

}
