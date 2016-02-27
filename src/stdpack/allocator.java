package stdpack;
import java.util.ArrayList;
import java.util.Scanner;
import stdpack.auxiliary;

public class allocator {
	
	public static void main(String[] args) {
		ArrayList<operation> historyList = new ArrayList<operation>();
		Scanner writer = new Scanner(System.in);
		resource lab3 = new resource(writer);
		user professor = new user(writer);
		operation test = new operation(professor, lab3, 7);
		resource room1 = new resource(writer);
		user student = new user(writer);
		operation test2 = new operation(student, room1, 7);
		historyList.add(test);
		historyList.add(test2);
		auxiliary.printAll(historyList);		
		
	}
}
