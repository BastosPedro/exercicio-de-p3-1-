package stdpack;
import java.util.Scanner;

public class user {
	//private boolean isStudent;
	private String name;
	private String email;

	public user(Scanner aux){
		System.out.println("enter name:");
		setName(aux.nextLine());
		System.out.println("enter email:");
		setEmail(aux.nextLine());
	}
//getters
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
//setters	
	public void setName(String input){
		this.name = input;
	}
	public void setEmail(String input){
		this.email = input;
	}
}
