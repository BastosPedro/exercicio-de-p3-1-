package stdpack;
import java.util.Calendar;
import java.util.Date;

public class auxiliary {

	public static Date addDays(final Date date, int days){
		Calendar aux = Calendar.getInstance();
		aux.setTime(date);
		aux.add(Calendar.DATE, days);
		return aux.getTime();
	}
}
