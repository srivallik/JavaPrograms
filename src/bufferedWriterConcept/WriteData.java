package bufferedWriterConcept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:/Selenium/write.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello I am new to Java");
		bw.newLine();
		bw.write("write data using BufferedWriter class");
		bw.newLine();
		bw.write(100);
		bw.newLine();
		char[] ch={'D','R','E','A','M'};
		bw.write(ch);
		bw.flush();

	}

}
