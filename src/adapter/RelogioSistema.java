package adapter;

import java.util.Calendar;

public class RelogioSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
