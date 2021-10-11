package notes;

public class ConparisonOperators {

	public static void main(String[] args) {
		
		// == is equal to
		// <= less than or equal to
		// < less than
		// > greater than
		// >= greater than or equal to
		// != not equal to
		// || or
		// && and
		
		int a = 5;
		int b = 4;
		
		boolean c = (a >= b);
		System.out.println(c); 
		
		double d = 8.8;
		
		if( d == 8.8) {
			System.out.println("They are equal!");
			
		}	
		if( d <= 9 ) {	
			System.out.println("It is not!");
			
		}	
		if(a == 5 || d == 8.8 || b == 7) { // with the or(||) operator the print out will show if even only one of the commands are true
			System.out.println("a is 5, d is 8.8 and b is 7.");
		}
			
		if(a >= 0 && b < 6)	{
			System.out.println("Correct!");
		}
		}
		

	}


