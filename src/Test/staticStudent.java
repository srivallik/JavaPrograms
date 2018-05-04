package Test;

public class staticStudent {
    int id;
    String name;
   static String collageName="IIT";
   staticStudent(int i,String n)
   {
	   id=i;
	   name=n;
   }
   void Change()
   {
	   collageName="BITS";
   }
   void Display()
   {
	   System.out.println("id is : "+ id + " name is :"+ name +" collageName is :"+collageName);
   }
	public static void main(String[] args) {
		staticStudent s=new staticStudent(100,"Karthi");
		s.Change();
        s.Display();
	}

}
