import java.util.Date;

public class resource {
	private String resourceID;
	private Date dateBegin;
	private Date dateEnd;
	private user responsible;

//getters	
	public String getResourceID(){
		return this.resourceID;
	}
	public Date getBegin(){
		return this.dateBegin;
	}
	public Date getEnd(){
		return this.dateEnd;
	}
//setters	
	public void setResourceID(String name){
		this.resourceID = name;
	}
	public void setBegin(Date date){
		this.dateBegin = date;
	}
	public void setEnd(Date date){
		this.dateEnd = date;
	}
}
