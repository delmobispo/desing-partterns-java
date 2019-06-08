package singleton;


public class EmpresaFacadeSingleton {

	private static EmpresaFacade instancia;

	public static EmpresaFacade getInstancia() {
		if (instancia == null) {
			instancia = new EmpresaFacade();
		}

		return instancia;
	}

}
