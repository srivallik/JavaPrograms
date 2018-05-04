package fileReaderConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextUsingCharArray {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Selenium/Chalo.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		fr.close();
		

	}

}
