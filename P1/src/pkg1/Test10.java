package pkg1;

import java.util.ArrayList;

public class Test10 {
	public static void seatSelect1() {
		ArrayList<Integer> cols = new ArrayList<>();
		ArrayList<String> rows = new ArrayList<>();
		char c1,c2;
		for(int i=1;i<41;i++) {
			cols.add(i);	
		}
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			rows.add(String.valueOf(c1));
		}
		for(int j=0;j<12;j++) {
			for(int i=0;i<26;i++) {
				c1=(char)(65+i);
				c2=(char)(65+j);
				rows.add(String.valueOf(c2)+String.valueOf(c1));
			}
		}
		int len1=rows.size();
		int len2=cols.size();
		System.out.println(rows);
		System.out.println(cols);
		System.out.println("Size of Infosys Auditorium: " +len1*len2);
		System.out.println("Rows: "+len1);
		System.out.println("Cols: "+len2);
	}
	public static void main(String[] args) {
		seatSelect1();
	}

}
