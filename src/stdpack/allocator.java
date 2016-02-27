package stdpack;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Scanner;

public class allocator {
	
	public static void main(String[] args) {
		ArrayList<operation> historyList = new ArrayList<operation>();
		//HashMap<user, ArrayList> historyHash = new HashMap<user, ArrayList>();
		Scanner writer = new Scanner(System.in);
		resource lab3 = new resource(writer);
		user professor = new user(writer);
		operation test = new operation(professor, lab3, 7);
		historyList.add(test);
		printAll(historyList);
		//System.out.println(historyHash.get(professor).getResourceID());		
		
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
}
