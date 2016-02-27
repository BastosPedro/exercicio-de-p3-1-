package stdpack;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class auxiliary {

	public static Date addDays(final Date date, int days){
		Calendar aux = Calendar.getInstance();
		aux.setTime(date);
		aux.add(Calendar.DATE, days);
		return aux.getTime();
	}
	public static void printAll(ArrayList<operation> list){
		for(int i = 0; i < list.size(); i++){
			System.out.print("\nAllocation #" + (i+1) + "\n" +
							 list.get(i).getResource().getResourceID() +"\n" +
							 list.get(i).getUser().getName() +"\n" +
							 list.get(i).getUser().getEmail()+"\n" +
							 list.get(i).getBegin()+"\n" + 
							 list.get(i).getEnd());
		}
	}
	public static boolean login(String nick, String pass, ArrayList<user> list){
		int aux = list.size();
		for(int i = 0; i < aux; i++){
			if(list.get(i).getNickName().equals(nick) 
			   && list.get(i).getPassword().equals(pass)){
				return true;
			}
			else return false;
			
		}return false;
	}
}
