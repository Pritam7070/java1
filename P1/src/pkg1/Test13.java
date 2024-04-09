package pkg1;

import java.io.File;

public class Test13 {

	public static void main(String[] args) {
		File f1=null;
		f1=new File("Movies/Sholay");
		f1.mkdirs();
		f1=new File("Movies/Lagaan");
		f1.mkdirs();
		f1=new File("Movies/Swadesh");
		f1.mkdirs();
	}

}
