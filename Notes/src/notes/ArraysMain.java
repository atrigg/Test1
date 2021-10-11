package notes;

public class ArraysMain {

	public static void main(String[] args) {
		
		String apple = "Apple";
		//String apple2 = "Apple";	
		//String apple3 = "Apple";
		//String apple4 = "Apple";
		//System.out.println(apple1 + " " + apple2 + " ");
		//is there a more dynamic way to store the variables?
		
		// This is a String array
		// arrays run on index
		
		//          index @
		String[] fruits = {"Apple", "Banana", "Cherry", "Dragonfruit"};
		
		//array of int
		int[] numbers = { 1, 2, 3, 4, 5};
		
		// Creating a blank array with the same length as the numbers array
		double[] doubles = new double[numbers.length];
		// that has a length of 5
		
		for (int i = 0; i < doubles.length; i++) {
			doubles[i] = numbers[i] * Math.PI;
			System.out.println(doubles[i]); // print array
		}
		
		numbers = new int[5];
		System.out.println(numbers[4]);
		
		
		
		//array of double
		double[] decimals = { 3.5, 54.6};
		
		//array of boolean
		boolean[] trueOrFalse = {true, false, true, false};
		char[] strToChar = apple.toCharArray();
		String temp = ""; // container to hold what I find
		
		// strToChar[i] when iterating or going through) the loop
		
		//strToChar[0];
		//strToChar[1];
		//strToChar[2];
		//strToChar[3];
		//for (int i = 0; i < strToChar.length; i++);
		// loops and arrays go together
		for (int i = 0; i < fruits.length; i++) {
			if(strToChar[i] != 'p');
		System.out.println(fruits[i]);
		}	 

	}

}
