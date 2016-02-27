import java.util.ArrayList;

public class allocator {
	
	//private ArrayList<operation> historic;
	public static void main(String[] args) {
		ArrayList<operation> history = new ArrayList<operation>();
		resource lab3 = new resource();
		user professor = new user();
		operation test = new operation(professor, lab3, 7);
		history.add(test);
		System.out.println(history.get(0).getResource().getResourceID());
		System.out.println(history.get(0).getUser().getName());
		System.out.println(history.get(0).getUser().getEmail());
		System.out.println(history.get(0).getBegin());
		System.out.println(history.get(0).getEnd());
		
	}
}
