package fileConcept;

import java.io.File;

public class ListofFiles {

	public static void main(String[] args) {
		File f=new File("C:/Selenium");
		int count=0;
		String[] s=f.list();
		for(String s1:s)
		{
			System.out.println(s1);
			count++;
		}
		System.out.println("count of files: "+ count);
	}
}
