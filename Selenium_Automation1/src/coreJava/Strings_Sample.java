package coreJava;

public class Strings_Sample {

	public static void main(String[] args) {
		// Non-primitiveType
		// String and Array

		String a = "Hello All";
		System.out.println(a);

		String firstName = "Shilpa";
		System.out.println(firstName);

		String xyz;
		xyz = "testing";

		// concadination

		System.out.println(a + "=" + firstName);

		// convert firstName string to Uppercase
		System.out.println(firstName.toUpperCase());
		System.out.println(a.toLowerCase());

		// convert int to String or
		String abc = "34";
		int bcd = 12;
		System.out.println(bcd + abc);// 1234 / 46

		// String to int
		int mno = Integer.parseInt(abc);
		System.out.println(bcd + mno);

		// int to String
		String w = Integer.toString(bcd);//"12"
		System.out.println(w+abc);//1234
		System.out.println(w+mno);//1234
		
		
		
		String a1 = "Apple";//index= 0
		String b1 = "apple";//length = 1
		String c1 = "Mango";
		
		//String lenth
		System.out.println(a1.length());
		//get the 'l' position from Apple
		System.out.println(a1.charAt(4));
		
		//Validate string
		if (a1.equals(b1)) {
			System.out.println("Both are  matching");
		}
		else {
			System.out.println("Both are NOT matching");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
