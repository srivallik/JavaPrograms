package Test;

public class MyStatic {
  public static void main(String args[])
  {
	  Student s= new Student();
	  s.rollno="06H91A1240";
	  s.cmarks=65;
	  Student.branch="IT";
	  System.out.println(s.rollno);
	  System.out.println(s.cmarks);
	  System.out.println(Student.branch);
	  Student s1=new Student();
	  s1.rollno="06H91A1239";
	  s1.cmarks=70;
	  System.out.println(s1.rollno);
	  System.out.println(s1.cmarks);
	  System.out.println(Student.branch);
	  
  }
}
class Student
{
	String rollno;
	int cmarks;
	static String branch;
	
	
}