package stringFunctions;

public class StringManip {

	public static void main(String[] args) {
		String str="rains have started here";
		String str1="rains have not started here";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', 5));
		System.out.println(str.indexOf("hello")); //if not found returns -1
		System.out.println(str.equals(str1));
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 10));
		System.out.println("**************");
		String arr[]=str.split(" ");
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*******");
		String arr1[]=str.split("have");
		for(int j=0;j<arr1.length;j++)
			System.out.println(arr1[j]);
		System.out.println("************");
		
		String x="100";
		int i=Integer.parseInt(x);
		System.out.println(i);
		
		String z=String.valueOf(i);
		System.out.println(z);
		
		
		

	}

}
