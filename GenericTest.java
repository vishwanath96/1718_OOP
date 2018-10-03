import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		List<Integer> integerList = new ArrayList<>();
		stringList.add("hello");
		stringList.add("hi");
		stringList.add("bye");
		integerList.add(33);
		integerList.add(7);
		integerList.add(40);
		
		printList(stringList);
		printList(integerList);
	}
	static <E> void printList(List<E> myList) {
		
		 Iterator<E> myItr=myList.iterator();
		 while(myItr.hasNext()) {
			 System.out.println(myItr.next() + "...");
		 }
		/* 
		for(E item : myList) {
			System.out.println("..."+ item);
		}*/
	}

}
