package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Test8 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> locations= new ArrayList<>();
		ArrayList<Integer> salesAmt = new ArrayList<>();
		ArrayList<String> yearMonth = new ArrayList<>();
		ArrayList<Integer> janFebMar =new ArrayList<>();
		String[] arr1 = new String[3];
		File f1 = new File("sales1.txt");
		Scanner sc1 = new Scanner(f1);
		for(int i=0;i<9;i++) {
			String s1 = sc1.nextLine();
			arr1 =s1.split(",");
			locations.add(arr1[0]);
			salesAmt.add(Integer.parseInt(arr1[1]));
			yearMonth.add(arr1[2]);
		}
		int len1 = locations.size();
		int sales1 = 0;
		String location1="";
		
		sales1 = 0;
		location1 = locations.get(0);
		for(int i =0;i<9;i++) {
			if(locations.get(i).equals(location1)) {
				sales1 = sales1+salesAmt.get(i);
			}
		}
		janFebMar.add(sales1);
		System.out.println(sales1+" : "+location1) ;
		
		sales1 = 0;
		location1 = locations.get(1);
		for(int i =0;i<9;i++) {
			if(locations.get(i).equals(location1)) {
				sales1 = sales1+salesAmt.get(i);
			}
		}	
		janFebMar.add(sales1);
		System.out.println(sales1+" : "+location1) ;
		
		sales1 =0;
		location1 = locations.get(2);
		for(int i =0;i<9;i++) {
			if(locations.get(i).equals(location1)) {
				sales1 = sales1+salesAmt.get(i);
			}
		}
		janFebMar.add(sales1);
		System.out.println(sales1+" : "+location1) ;
		
		int janFebMarTotal = janFebMar.get(0)+janFebMar.get(1)+janFebMar.get(2);
		System.out.println(janFebMarTotal);
	}
		
}
