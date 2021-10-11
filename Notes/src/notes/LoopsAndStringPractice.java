package notes;

public class LoopsAndStringPractice {

	public static void main(String[] args) {
		// index at = 0123456789101112131415161718192021
		String lyric = "Mary had a little lamb";
		
		// loop begins | continue until | count itself
		for(int i = 0; i < lyric.length();  i++) {
			System.out.println(i);
			System.out.println(lyric.charAt(i));
			System.out.println(lyric.indexOf(i));
			System.out.println(" Loop at:" + i + " character is: " + lyric.charAt(i));
			
			
			
		}

	}

}
