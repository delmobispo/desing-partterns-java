package bridge;

import java.io.InputStream;
import java.net.URL;

public class MapaGoogle implements Mapa{

	@Override
	public String get(String endereco) {
		try {
			URL google = new URL("https://maps.google.com.br/maps?q=" + endereco);
			InputStream stream = google.openStream();
			stream.available();
		} catch (Exception exc) {
			throw new RuntimeException(exc);
		}
		return "mapa do google " + endereco;
	}

}
