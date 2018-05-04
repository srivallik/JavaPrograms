package colections;
import java.util.*;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("name", "Srivalli");
		ht.put("technlogy", "Testing");
		ht.put("place", "hyderabad");
		System.out.println(ht.get("place"));
		Hashtable<String,String> ht1=new Hashtable<String,String>();
		ht1.put("name","Karthi");
		ht1.put("technology", "MBA");
		ht1.put("location", "USA");
		System.out.println(ht1.get("location"));
		Hashtable<String, Hashtable> ht3=new Hashtable<String,Hashtable>();
		ht3.put("name", ht);
		ht3.put("technology", ht1);
		
		System.out.println( ht3.get("name").get("technology"));
		System.out.println(ht3.get("technology").get("name"));
		

	}

}
