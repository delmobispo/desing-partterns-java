package flyweight;

import java.util.Arrays;
import java.util.List;

public class TesteNotasMusicais {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		List<Nota> doReMiFa = Arrays.asList(
				notas.get("do"), 
				notas.get("re"), 
				notas.get("mi"), 
				notas.get("fa"),
				notas.get("fa"), 
				notas.get("fa"),

				notas.get("do"), 
				notas.get("re"), 
				notas.get("do"), 
				notas.get("re"), 
				notas.get("re"),
				notas.get("re"),

				notas.get("do"), 
				notas.get("sol"), 
				notas.get("fa"), 
				notas.get("mi"), 
				notas.get("mi"),
				notas.get("mi"),

				notas.get("do"), 
				notas.get("re"), 
				notas.get("mi"), 
				notas.get("fa"), 
				notas.get("fa"),
				notas.get("fa"));
		
		
		//Note que todos são sempre a mesma referencia de objeto
		System.out.println(doReMiFa); 
	
		System.out.println(Arrays.asList(NotaMusical.DO.get(), NotaMusical.DO.get()));
	}

}
