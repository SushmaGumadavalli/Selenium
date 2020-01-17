package coreJava;
import java.util.Scanner;

public class Findtheage1 {
	public static void main(String Args[]) {
		System.out.print("Enter the age:");
		 Scanner in = new Scanner(System.in);
		int a =-8;// in.nextInt();
		//in.close();
		   if(a<=2 && a>=0) {
			System.out.println("Infant");
		   }else if (a<=12 && a>2) {
			System.out.println("Child");
		   }else if(a>12 && a<=25) {
				System.out.println("Youth");
			}else if(a>25 && a<=59) {
				System.out.println("Adult");
			}else if(a> 59 && a<=100) {
				System.out.println("Senior citizen");
			}else if(a>100) {
				System.out.println("Invalid age entered,Maximum age limit is 100");
			}else {
				System.out.println("Invalid age entered,please enter positive numbers"
						+ "");
			
			}
		}
		
	}

