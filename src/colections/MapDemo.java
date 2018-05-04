package colections;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "Hi");
		mp.put(2, "Hello");
		mp.put(3,"oye");
		mp.put(4, "Bye");
		
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		

	}

}
