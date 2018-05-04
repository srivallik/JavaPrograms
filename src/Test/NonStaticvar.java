package Test;

public class NonStaticvar {

	public static void main(String[] args) {
	Inc i=new Inc();
	Inc i1=new Inc();
	Inc i2=new Inc();
			

	}

}

class Inc
{
	int j=100;// non static var creates memory on every obj creation,it do not copy the value of earlier
	Inc()
	{
		j++;
		System.out.println(j);
	}
}