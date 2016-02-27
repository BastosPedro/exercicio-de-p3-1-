import java.util.Scanner;

public class resource {
	private String resourceID;
	
	public resource(){
		Scanner aux = new Scanner(System.in);
		System.out.println("enter the room name");
		setResourceID(aux.nextLine());
		aux.close();
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
