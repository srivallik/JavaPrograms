public class Test1{
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		s1.insertrecord(111,"Karthikeya");
		s2.insertrecord(222,"Chinnu");
		s1.displayinfo();
		s2.displayinfo();
	}
	}
class Student1{
	int id;
	String name;
	void insertrecord(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayinfo()
	{
		System.out.println(id+" "+name);
	}
}

