package stdpack;
import java.util.ArrayList;
import java.util.Scanner;
import stdpack.auxiliary;

public class allocator {
	
	private static boolean isRunning = true;
	private static int cursor;
	
	public static void main(String[] args) {
		ArrayList<user> userList = new ArrayList<user>();
		ArrayList<resource> resourceList = new ArrayList<resource>();
		ArrayList<operation> historyList = new ArrayList<operation>();
		
		user adm = new user("MASTER", "adm@ic.ufal", "adm", "123");
		userList.add(adm);
		Scanner moveCursor = new Scanner(System.in);
		Scanner writer = new Scanner(System.in);
		
		while(isRunning == true){
			System.out.println("Please choose an option:\n"
			           + "1)Login\n2)Register\n0)Exit");
			cursor = moveCursor.nextInt();			
			
			switch (cursor){
				case 0:
				System.out.println("Please choose an option:\n"
				           + "1)Login\n2)Register\n0)Exit");
				cursor = moveCursor.nextInt();
				case 1:
			 		System.out.println("Please enter your nickname and passoword");
			 		if(auxiliary.login(writer.nextLine(), writer.nextLine(), userList) == true){
			 			System.out.println("Access granted");
			 			cursor = 0;
			 		}
			 		else System.out.println("Access denied, wrong password or username");;
			 		break;
				case 2:
					user test = new user(writer);
					userList.add(test);
					cursor = 0;
					break;
				case 9:
					moveCursor.close();
					writer.close();
					System.out.println("Goodbye");
					isRunning = false;
			}
		  }
		}
		/*resource lab3 = new resource(writer);
		user professor = new user(writer);
		allocate(historyList, professor, lab3, 7);
		professor.consult(historyList);*/		
		

	public static void allocate(ArrayList<operation> anyL, user anyU, resource anyR, int time){
		operation aux = new operation(anyU, anyR, 7);
		anyL.add(aux);
	}
	public static void mainMenu(Scanner num, Scanner word, int move){
		while(move != 9){
			System.out.println("Welcome, user, you can:\n"
								+ "1)allocate\n9)exit");
		}
	}
}
