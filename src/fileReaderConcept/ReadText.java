package fileReaderConcept;

import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:/Selenium/Chalo.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
fr.close();
	}

}
