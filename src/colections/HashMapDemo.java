package colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2, "UFT");
		hm.put(3, "RPA");
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		hm.put(4,"TOSCA");
		
		for(Entry e:hm.entrySet())
		{
			System.out.println(e.getKey() +"  "+ e.getValue());
		}
		hm.remove(3);
		System.out.println(hm);
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		
		Employee e1=new Employee("Karthi",2,"MBA");
		Employee e2=new Employee("Vishwa",32,"VLSI");
		Employee e3=new Employee("Srilu",29,"IT");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		for(Entry<Integer, Employee> ee:emp.entrySet())
		{
			int val=ee.getKey();
			Employee obj=ee.getValue();
			
			System.out.println(val);
			System.out.println(obj.name+ "  "+obj.age+"  "+obj.dept);
			
		}
		
		
		
		
		
		
		
		

	}

}
