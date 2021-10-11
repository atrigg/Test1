package notes;

import java.util.*;

public class Dogs {
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dog2 d1 = new Dog2("Fifi", "poodle", 4, 16.6, "long-hair");
		Chihuahua c1 = new Chihuahua("Chico", "chihuahua", 15, 6.4, "bald");
		
		//c1.isAppleHead = true;
		//c1.isTeaCup = true;
		//c1.uprightEars = true;
		//System.out.println(c1.isAppleHead + c1.name);
		
		Person p1 = new Person();
		System.out.println("Please enter the owner's last name");
		p1.setLastName("Trigg");
		System.out.println(p1.getLastName());
		int choice = 0;
		while(choice != 3) {
			choice = dogMain();
			switch(choice) {
			case 1:
				System.out.println("Please enter info about the dog");
				System.out.println("name,breed, age, size, coat, owner's last name, owner's address");
				String info = scan.nextLine();
                break;
			
			case 2:
				System.out.println("Enter the last name of the owner to mark dog as clean");
				break;
	      case 3:
			System.out.println("Thank you!");
			break;
		  default:
			System.out.println("Please enter a number from 1 to 3");
			break;
		}
		}

	}
	
	public static int dogMain() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("++++WELCOME TO THE GROOMER APP++++");
		System.out.println("Enter 1 to add dog");
		System.out.println("Enter 1 to remove a dog and mark completed");
		System.out.println("Enter 1 to exit the program");
		
		//return the int input to the switch case statement
		int choice = scan1.nextInt();
		System.out.println(); //test space
		return choice;
		
		
	}
 
}
