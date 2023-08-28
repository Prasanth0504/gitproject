package com.Day4Practice;

public class Practice {
	private static final String Welcome = null;

	public static void main(String[] args) {

		String a[]=new String [5];
		a[0]="Ramu";
		a[1]="Somu";
		a[2]="Well";
		a[3]="Come";
		a[4]="to";
		
		for (String x : a) {
			
			
			System.out.println(x);
			
		}
		
		String s1 = "sql";
		String s2 = "Java";
		
		
		String concat = s1.concat(s2);

		
		System.out.println(s1 + '\t' +s2);
		
		
		
		
		String x = "Welcome To Java Class";
		
		for (int i=x.length()-1; i>=0; i++) {
			System.out.println(x.charAt(i));
			
			
		}
		
	
}


			

		}

	

