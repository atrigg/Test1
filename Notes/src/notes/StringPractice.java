package notes;

public class StringPractice {

	public static void main(String[] args) {
		// index value = 0 /1 /2 /3 /4 
		// character = h | e| l | l | o
		// length = 1 | 2 | 3 | 4 | 5
		String message = "hello there";
		char msg2 = 'h'; //char gives number values to characters
		int ascii = msg2;
		
		System.out.println(message.length());
		System.out.println(message.indexOf("h"));
		System.out.println("The numerical value of this character is: " + ascii);
		if(message.toLowerCase().equals(msg2)) {
			System.out.println("They are equal");
		}else {
			System.out.println();
			
			int i = 0;
			while (i < 5) {
				System.out.println(" While loop looping at " + i);
				i++;
			}
			do {
				System.out.println(" DoWhile loop looping at " + i);
				i++;
			} while(i <= 10);
			}
			
		}
		

	}


