package coreJava;

public class DataTypesSample1 {

	//Class = Test Scenario
	//Method = Test Case
	
	public static void main(String[] args) {
	
		//byte short int long
		//float double
		//char 
		//boolean
		
		byte d = 127;//Type mismatch: cannot convert from int to byte
		
		int a = 70;
		int b = 60;
		
		int c;
		
		c = a+b;
		System.out.println(c);
		
		int abc = 123;
		double  bcd = 145.6589;
		double  xyz = abc+bcd;
		System.out.println(xyz);
		
		double y = 98;
		System.out.println(y);//98.000
		
		
		
	}

}
