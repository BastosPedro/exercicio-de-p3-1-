package stdpack;
import java.util.Scanner;
import java.util.ArrayList;

import stdpack.operation;

public class user {
	private boolean isAdm;
	private String name;
	private String email;
	private String nickname;
	private String password;
	
	//builds adm
	public user(String name, String email, String nick, String pass){
		setName(name);
		setEmail(email);
		setNickName(nick);
		setPassword(pass);
		setAdm(true);
	}
	//builds other users
	public user(Scanner aux){
		System.out.println("Please, enter your name:");
		setName(aux.nextLine());
		System.out.println("Please, enter email:");
		setEmail(aux.nextLine());
		System.out.println("Please, enter your username");
		setNickName(aux.nextLine());
		System.out.println("Please, enter your password");
		setPassword(aux.nextLine());
		setAdm(false);
		System.out.println("User registered");
	}
	public void consult(ArrayList<operation> anyList){
		int auxSize = anyList.size();
		for(int i = 0; i < auxSize; i++){
			if(anyList.get(i).getUser().equals(this)){
				System.out.println(anyList.get(i).getResource().getResourceID() + "\n"
								   + anyList.get(i).getBegin() + "\n" + 
								   anyList.get(i).getEnd()
									);
			};
		}
	}
//getters
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public String getNickName(){
		return this.nickname;
	}
	public String getPassword() {
		return password;
	}
	public boolean getisAdm() {
		return this.isAdm;
	}
//setters	
	public void setName(String input){
		this.name = input;
	}
	public void setEmail(String input){
		this.email = input;
	}
	public void setNickName(String input){
		this.nickname = input;
	}
	public void setAdm(boolean isAdm) {
		this.isAdm = isAdm;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
