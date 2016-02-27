import java.util.Scanner;

public class user {
	//private boolean isStudent;
	private String name;
	private String email;

	public user(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name:");
		setName(scanner.nextLine());
		System.out.println("enter email:");
		setEmail(scanner.nextLine());
		scanner.close();
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
