package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Test6 {
	public static void sepWords(int size1) throws IOException {
		int size =size1;
		File f1 = new File("dictionary.txt");
		String fname1 = "words_";
		String fname3 = ".txt";
		String fname = fname1+size+fname3;
		FileWriter fw1 = new FileWriter(fname);
		
		Scanner sc1 = new Scanner(f1);
		String s1="";
		int len1=0;
		while(sc1.hasNext()) {
			s1 = sc1.nextLine();
			len1 =s1.length();
			if(len1 == size){
				System.out.println(s1);
				fw1.write(s1);
				fw1.write("\n");
			}
			
		}
		fw1.close();
		
	}

	public static void main(String[] args) throws IOException {
		for(int i=2;i<23;i++) {
			sepWords(i);
		}
		
		}

}
