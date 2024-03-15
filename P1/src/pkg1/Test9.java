package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test9 {
	public static void parse1(String fname) throws IOException {
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		String s1="";
		String s2="";
		int len1=0;
		while(sc1.hasNext()) {
			s1 = sc1.nextLine().replace(" ","").replace("-","");
			len1 = s1.length();
			String c1 = String.valueOf(s1.substring(0,1));
			String c2 = String.valueOf(s1.substring(0,2));
			String c3 = String.valueOf(s1.substring(0,3));
			if(len1==13 && c3.equals("+91")) {
				s2=s1;
				System.out.println(s2);
			}
			else if(len1==12 && c2.equals("91")) {
				s2="+"+s1;
				System.out.println(s2);
			}
			else if(len1==11 && c1.equals("0")) {
				s2=s1.replaceFirst("0", "+91");
				System.out.println(s2);
			}
			else if(len1==10) {
				s2="+91"+s1;
				System.out.println(s2);
			}
			else {
				System.out.println("Unknown Format Cannot Parse");
			}
		}
	}
		public static void main(String[] args) throws IOException {
		//parse1("phone1_CS.txt");
		parse1("phone1_PT.txt");
		
	}
}
