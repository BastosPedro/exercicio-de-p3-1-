package stdpack;
import stdpack.auxiliary;
import java.util.Date;

public class operation {
	private user User;
	private resource Resource;
	private Date dateBegin;
	private Date dateEnd;
	
	public operation(user newUser,resource newResource, int days){
		setUser(newUser);
		setResource(newResource);
		dateBegin = new Date();
		dateEnd = auxiliary.addDays(dateBegin, days);
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
