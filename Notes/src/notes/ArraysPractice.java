package notes;

public class ArraysPractice {

	public static void main(String[] args) {
		System.out.println("Welcome to our Zombie Killer Program! ");
		
		
		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		String zombie[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
		int zombieKillingNumbers[] = {8, 14, 79, 103, 122, 184};
		
		System.out.println("Backpack items!");
//		System.out.println(backpack[0]);
//		System.out.println(backpack[1]);
//		System.out.println(backpack[2]);
		for (int i = 0; i < backpack.length; i++) {
			//while (i <= 0) {
			if(backpack[i] != "Assault Rifle" && backpack[i] != "Sniper") {
				System.out.println(backpack[i]);
			}
			//System.out.println(backpack[i]);
			
		}
		System.out.println("Zombie types!");
		//System.out.println(zombie[0]);
		//System.out.println(zombie[1]);
		//System.out.println(zombie[2]);
		for (int i = 0; i < zombie.length; i++) {
			//while (i <= 0) {
			if(zombie[i] != "Mid-range zombie" && zombie[i] != "Long-range zombie") {
		
			System.out.println(zombie[i]);
			}
		}
		
		System.out.println("This numbers are zombie killers!");
		//System.out.println(zombieKillingNumbers[0]);
		//System.out.println(zombieKillingNumbers[1]);
		//System.out.println(zombieKillingNumbers[2]);
		//System.out.println(zombieKillingNumbers[3]);
		//System.out.println(zombieKillingNumbers[4]);
		//System.out.println(zombieKillingNumbers[5]);
		for (int i = 0; i < zombieKillingNumbers.length; i++) {
			//while (i <= 0) {
			if(zombieKillingNumbers[i] != 8 && zombieKillingNumbers[i] != 79)
			System.out.println(zombieKillingNumbers[i]);
			
			
		}
		
		
	
		
	}
		
	}
   

