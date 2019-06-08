package memento;

import java.time.LocalDate;

public class TesteContrato {
	
	public static void main(String[] args) {

        Historico historico = new Historico();

        Contrato contrato = new Contrato(LocalDate.now(), "Mauricio", TipoContrato.NOVO);
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());
        
        contrato.restaura(historico.get(1));
    }

}
