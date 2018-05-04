package colections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Hello");
		ar.add("h r u");
		ar.add("thanks");
		/*System.out.println(ar);
		System.out.println(ar.get(1));
		Iterator<String> it1=ar.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("bye!!!");
		ar1.add("...........");
		ar1.addAll(2, ar);
		Iterator<String> it2=ar1.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		

	}

}
