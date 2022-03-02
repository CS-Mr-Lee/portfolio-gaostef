
public class Gao_Stefany_OOQuiz1 {

	public static void main(String[] args) {
		
		Vegetable myVeg = new Vegetable("carrot", 23, 52);
		Human bob = new Human("Bob", 64, 34);
		Cookie mintCookie = new Cookie("Mint cookie", 323, 253);
		Cookie chocolateCookie = new Cookie("Chocolate cookie", 134, 254, true);
		Cookie jamCookie = new Cookie("Jam cookie", 352, 134, false);

		// testing for person trying to eat a packaged cookie
		System.out.println(bob.getName() + " will try to eat the bag");
		bob.eat(chocolateCookie, 43);
		System.out.println();

		// testing for person trying to eat too much of a vegetable
		System.out.println(bob.getName() + " will try to eat more vegetables than there is");
		bob.eat(myVeg, 2343);
		System.out.println();

		// testing for eating cookie and gaining energy
		System.out.println(bob.getName() + " has " + bob.getEnergyLevel() + " much energy. They will eat 122 grams of a mint cookie");
		bob.eat(mintCookie, 122);
		System.out.println("They now have " + bob.getEnergyLevel() + " energy");
	}

}
