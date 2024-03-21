package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Test11 {

	public static void main(String[] args) throws FileNotFoundException , IOException{
		String s1="";
		String name1="chandrashekar";
		File f1=new File("2.html");
		FileWriter fw1=new FileWriter("out.html");
		Scanner sc1= new Scanner(f1);
		while(sc1.hasNext()) {
		
			s1=sc1.nextLine().replace("pritamtripathy", name1);
			System.out.println(s1);
			fw1.write(s1);
			fw1.write("\n");
			
		}
		
		fw1.close();
		

}
}
