package printWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFiles {

	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter("C:/Selenium/file3.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:/Selenium/file1.txt"));
		
		String line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
        br=new BufferedReader(new FileReader("C:/Selenium/file2.txt"));
       
       line=br.readLine();
       
       while(line!=null)
       {
    	   pw.println(line);
    	   line=br.readLine();
       }
       pw.flush();
       pw.close();
	}

}
