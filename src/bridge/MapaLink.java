package bridge;

public class MapaLink implements Mapa {

	@Override
	public String get(String endereco) {
		//Faz a comunicação com fornecedor externo
		return "mapa link" + endereco;
	}

}
