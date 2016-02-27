import java.util.Calendar;
import java.util.Date;

public class operation {
	private user User;
	private resource Resource;
	private Date dateBegin;
	private Date dateEnd;
	
	public operation(user newUser, resource newResource, int days){
		setUser(newUser);
		setResource(newResource);
		dateBegin = new Date();
		dateEnd = addDays(dateBegin, days);
	}
	
	public static Date addDays(final Date date, int days){
		Calendar aux = Calendar.getInstance();
		aux.setTime(date);
		aux.add(Calendar.DATE, days);
		return aux.getTime();
	}
	//getters
	public user getUser(){
		return this.User;
	}
	public resource getResource(){
		return this.Resource;
	}
	public Date getBegin(){
		return this.dateBegin;
	}
	public Date getEnd(){
		return this.dateEnd;
	}
	//setters
	public void setUser(user input){
		this.User = input;
	}
	public void setResource(resource input){
		this.Resource = input;
	}
	
	

}
