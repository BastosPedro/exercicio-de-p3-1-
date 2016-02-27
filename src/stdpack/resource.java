package stdpack;
import java.util.Scanner;

public class resource {
	private String resourceID;
	
	public resource(Scanner aux){
		System.out.println("enter the room name");
		setResourceID(aux.nextLine());
	}
//getters
	public String getResourceID(){
		return this.resourceID;
	}
	
//setters	
	public void setResourceID(String name){
		this.resourceID = name;
	}
}
