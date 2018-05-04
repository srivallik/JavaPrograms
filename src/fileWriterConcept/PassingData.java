package fileWriterConcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PassingData {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Selenium/Hello.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write(100);
		fw.write("\n");
		fw.write("Hello");
		fw.write(110);
		fw.write("\n");
		fw.write("Java");
		char[] ch={'k','a','r','t','h','i'};
		fw.write(ch);
		fw.flush();
		fw.close();
	

	}

}
