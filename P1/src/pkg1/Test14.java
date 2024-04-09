package pkg2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) throws IOException {
		File f1=new File("movies2.json");
		Scanner sc1=new Scanner(f1);
		String s1="";

		while(sc1.hasNext()) {
			s1=sc1.nextLine();
			System.out.println(s1);	
		}
	}
}
