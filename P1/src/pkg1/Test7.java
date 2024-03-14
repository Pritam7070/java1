package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args)throws IOException {
		File f1 = new File("template.txt");
		String[] arr1 = {"Pritam","Ganesh","Suresh","Ramesh"};
		String[] arr2 = {"Berhampur","Banglore","Chennai","Hyderabad"};
		int[] arr3 = {20000,30000,31000,32000};
		String[] arr4 = {"15-Mar-2024","16-Mar-2024","17-Mar-2024","18-Mar-2024"};
		try (Scanner sc1 = new Scanner(f1)) {
			String s1 = sc1.nextLine();
			System.out.println(s1);
			String fname1;
			String fname2 = ".txt";
			String fname;
			
			for(int i=0;i<4;i++) {
				fname1 = arr1[i];
				fname = fname1+fname2;
				FileWriter fw1 = new FileWriter(fname);
				String s2 = s1.replace("$name",arr1[i]).replace("$location", arr2[i]).replace("$salary", String.valueOf(arr3[i])).replace("$date", arr4[i]);
				System.out.println(s2);
				fw1.write(s2);
				fw1.close();
				
			}
		}
		
	}

}
