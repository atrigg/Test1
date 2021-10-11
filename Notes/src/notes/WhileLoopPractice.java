package notes;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		//int a = 0;
		
		//while(a < 10) {  // the value inside of the parenthesis is either true or false.
			           // if it's true, the code in the sysout run forever.
			           // if it's false, the print won't run at all. it will just error out.
			
			
			//System.out.println("a is less than 10: " + a);
			//increment 'a' by 1 - (a++)
			//a++;
			// while loops are important because you may want to calculate something to the end but you may not know what the end is.
			
			//do {
			// the difference between a while loop and a do while loop is that the do while loop will always print what's in the parenthesis first, no matter if it's true or false.	
				//.out.println("a");
			} //while(a == 1);
	
	String sentence = "You will master this!";
			Scanner scan = new Scanner(sentence);
			ArrayList<String> words = new ArrayList<String>();
			
			while(scan.hasNext()) {
				words.add(scan.next());
			}
			
			System.out.println(words);
		}
		

	}


