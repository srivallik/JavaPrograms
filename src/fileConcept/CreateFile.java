package fileConcept;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Selenium/abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("length of the file: "+f.length());
		System.out.println("absolute path: "+f.getAbsolutePath());
		System.out.println("free space left"+ f.getFreeSpace());
		System.out.println(f.toString());
		System.out.println("file or not :"+f.isFile());
		System.out.println("name of file: "+f.getName());
		System.out.println(f.delete()); 
		
		

	}

}
