package fileConcept;

import java.io.File;

public class createDir {

	public static void main(String[] args) {
		File dir=new File("C:/Selenium/Files");
		dir.mkdir();
		System.out.println(dir.exists());
		System.out.println("directory exists: "+dir.isDirectory());
		System.out.println("can readable "+dir.canRead());
		System.out.println("can write "+dir.canWrite());
		System.out.println("parent dir name: "+dir.getParent());
		System.out.println("path of dir: "+dir.getPath());
		System.out.println("delete dir: "+dir.delete());
		
		

	}

}
