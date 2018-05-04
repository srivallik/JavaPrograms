package printWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeFilesAlternatively {

	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter("C:/Selenium/file3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("C:/Selenium/file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:/Selenium/file2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while((line1!=null)||(line2!=null))
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		pw.close();
				

	}

}
