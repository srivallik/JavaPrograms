package Test;

public class Staticandnonstatic {
    static int i=5;
    int j;
    Staticandnonstatic()
    {
    	i++;
    	System.out.println("static i value is :"+ i);
    }
    Staticandnonstatic(int j){
    	j++;
    	System.out.println("non static j value is: "+ j);
    }
    
	public static void main(String[] args) {
		Staticandnonstatic s1=new Staticandnonstatic();
		Staticandnonstatic s2=new Staticandnonstatic();
		Staticandnonstatic s3=new Staticandnonstatic();
		
		Staticandnonstatic s4=new Staticandnonstatic(1);
		Staticandnonstatic s5=new Staticandnonstatic(2);
	}

}
