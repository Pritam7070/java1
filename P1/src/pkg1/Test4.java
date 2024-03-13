package pkg1;

import java.util.ArrayList;

public class Test4 {
	public static void encode1(String word) {
		String s1 = word; 
		String s2 = "";  //This will be used to store the converted numerical positions
		String char1 =""; //This will be used to store each character of s1 during iteration.
		int position = 0;
		String alpha1 =""; //This will be used to store each letter of the alphabet during iteration.
		
		ArrayList<String> alpha = new ArrayList<>();
		ArrayList<String> digits = new ArrayList<>();
		
		for(int i = 0;i<26;i++) {
			alpha1 = String.valueOf((char)(65+i));
			alpha.add(alpha1);
		}
		for(int i=0;i<26;i++) {
			alpha1 = String.valueOf((char)(97+i));
			alpha.add(alpha1);
		}
		for(int i = 0; i<10;i++) {
			alpha1 = String.valueOf(i);
			alpha.add(alpha1);
		}
		alpha.add(" ");
		alpha.add(",");
		alpha.add(".");
		alpha.add("$");
			
		for(int i=0;i<66;i++) {
			digits.add(String.valueOf(i));
		}
		for(int i =0; i<s1.length();i++) {
			char1 = s1.substring(i,i+1); 
			position = alpha.indexOf(char1); 
			s2 = s2+digits.get(position);
		}
		
		System.out.println(s2);
	}

	public static void main(String[] args) {
		encode1("I am Working in a MNC.We have engineer,managers");
		encode1("Elections will be held in may 2024 $$.");
		encode1("A");
		
	}
}
