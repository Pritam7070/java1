package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) throws IOException {
		File f1= new File("names.txt");
		Scanner sc1=new Scanner(f1);
		String s1="Dear $name,  You have been appointed as Centre Head at $location with $salary.  Please report for duty on $date";
		
		String str1 = "";
		String name1 = "";
		String location1 ="";
		String salary1="";
		String date1 ="";
		String[] arr1 ;
		
		for(int i = 0;i<10;i++) {
			str1 = sc1.nextLine();
			arr1 = str1.split("\t");
			name1 = arr1[0];
			location1 =arr1[2];
			salary1 = arr1[1];
			date1 = arr1[3];
			String s2= s1.replace("$name" ,name1).replace("$location", location1).replace("$date",date1).replace("$salary", salary1);
			System.out.println(s2);
		}
		
		
	}

}
