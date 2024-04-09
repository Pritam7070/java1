package pkg1;

import java.util.ArrayList;

public class Practice1 {

		public static void encode(String word) {
			String s1 = word; 
			String s2 = "";  
			String char1 =""; 
			int position = 0;
			String alpha1 =""; 
			
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
			encode("My name is Pritam.");
			encode("This is my first coding practice ");
			encode("A B C D E F");
			
		}
	}
