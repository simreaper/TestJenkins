import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	int number;
	String book;

	Arraylist(int number, String book) {
		this.number = number;
		this.book = book;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Arraylist> list = new ArrayList<Arraylist>();
		Arraylist s1 = new Arraylist(101, "Just wait and watch");
		Arraylist s2 = new Arraylist(102, "Just wait and watch part 2");
		Arraylist s3 = new Arraylist(103, "Just wait and watch part 3");
		Arraylist s4 = new Arraylist(104, "Just wait and watch part 3");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(22);
		l1.add(24);
		l1.add(25);
		java.util.List<Integer> list1 = Collections.unmodifiableList(l1);	
		list1.add(26);
		//list1.add(s4);
		list.add(new Arraylist(1234, "Hello"));
		for (Arraylist al : list) {
			System.out.println(al.number + " " + al.book);
		}
		// list.get(a1);
		//list.remove(1);
		for (Arraylist al : list) {
			System.out.println(al.number + " " + al.book);
		}
	}
}
