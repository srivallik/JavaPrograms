package colections;
import java.util.*;  
public class LinkedListDemo {

	public static void main(String[] args) {
		

		  LinkedList<String> al=new LinkedList<String>(); 
		  al.add("UFT");
		  al.add("Selenium");
		  al.add("RFA");
		  System.out.println(al);
		  al.addFirst("Functional");
		  al.addLast("Automation");
		  System.out.println(al);
		  System.out.println(al.get(1));
		  al.set(0, "Tools");
		  System.out.println(al);
		  al.remove(0);
		  System.out.println(al);
		  System.out.println("********");
		  for(String n:al)
		  {
			  System.out.println(n);
		  }
		  System.out.println("********");
		  Iterator<String> it=al.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  System.out.println("*********");
		  int num=0;
		  while(al.size()>num)
		  {
			  System.out.println(al.get(num));
			  num++;
		  }
		

	}

}
