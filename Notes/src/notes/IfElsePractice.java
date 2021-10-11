package notes;

import java.util.*;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		int n = scan.nextInt();
		//System.out.println(n);
		
		if( n >= 90 && n <= 100) {
			System.out.println("A");
			
		} else if( n >= 80 && n <= 89) {
			System.out.println("B");
			
		} else if( n >= 70 && n <= 79) {
			System.out.println("C");
			
		} else if( n >= 60 && n <= 69)	{
			System.out.println("D");
			
		}else if( n >= 0 && n <= 59) {
			System.out.println("F");
			
		} else { // There's no need to put in info like with the if and else if variables
			     // If the info you input isn't within the range setup it will be invalid
			System.out.println("Invalid grade!");
			
			
		}
		}
		
		}
		

	


