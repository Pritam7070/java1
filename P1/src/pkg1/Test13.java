package pkg2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Test13 {
	public static void createDir1(String inFile) throws IOException {
		ArrayList<String> movies1=new ArrayList<>();
		String s2=inFile.replace(".txt", "");
		File f1=null;
		File f2=new File(inFile);
		Scanner sc1=new Scanner(f2);
		String s1="";
		String dir1="";
		String root1=s2;
		int size1=0;
		while(sc1.hasNext()) {
			s1=sc1.nextLine();
			System.out.println(s1);
			movies1.add(s1);	
		}
		size1=movies1.size();
		for(int i=0;i<size1;i++) {
			dir1=movies1.get(i);
			f1=new File(root1+"/"+dir1);
			f1.mkdirs();
		}
	}
	public static void main(String[] args) throws IOException {
		createDir1("movies1.txt");
		//createDir1("sports1.txt");
		//createDir1("leaders.txt");
		}
}
