package pkg1;
import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		String alpha1 = "";
		
		ArrayList<String> special = new ArrayList<>();
		ArrayList<String> alpha = new ArrayList<>();
		ArrayList<String> digits = new ArrayList<>();
		
		for(int i = 0;i<26;i++) {
			alpha1 = String.valueOf((char)(65+i));
			alpha.add(alpha1);	
		}
		for(int i=0;i<26;i++) {
			digits.add(String.valueOf(i));
		}
		String char2 = "";
		String special1 = "";
		char2 = "!@#$%^&*()-_=+{}[];:.,<>?|" ;
		
		for(int i = 0;i<char2.length();i++) {
			special1 = char2.substring(i,i+1);
			special.add(special1);
		}
		
		System.out.println(special);
		System.out.println(alpha);
		System.out.println(digits);
		System.out.println(char2.length());
		

	}

}
