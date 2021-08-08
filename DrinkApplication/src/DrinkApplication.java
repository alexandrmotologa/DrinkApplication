
public class DrinkApplication {

	public static void main(String[] args) {
		HotDrink.printInfo();
		SoftDrink.printInfo();
		Water.printInfo();
	}

}


// super class
class Drink {
	// properties
	static String name = "Something New";
	// methods
	static void printInfo() {
		System.out.printf("====== %s ======\n", Drink.class.getName());
		System.out.printf("|%17s|\n", name);
		System.out.println("===================");
	}
}

// extend class
class HotDrink extends Drink {
	static char temp = '+';
	static float temperature = 77.77f;
	static String title = "Tea";
	// polymorphism: OVERRIDING
	static void printInfo() {
		Drink.printInfo();
		System.out.printf("===== %s ====\n", HotDrink.class.getName());
		System.out.printf("|Product:%9s|\n", title);
		System.out.printf("|Temperature:%c%3.1f|\n", temp, temperature);
		System.out.println("===================");
	}
}

//extend class
class SoftDrink extends Drink {
	static char temp = '+';
	static float temperature = 2.7f;
	static String title = "Coca-Cola";
	static boolean sugar = true;

	// polymorphism: OVERRIDING
	static void printInfo() {
		Drink.printInfo();
		System.out.printf("===== %s ===\n", SoftDrink.class.getName());
		System.out.printf("|Product:%8s|\n", title);
		System.out.printf("|Sugar: %10b|\n", sugar);
		System.out.printf("|Temperature:%2c%.1f|\n", temp, temperature);
		System.out.println("===================\n");
	}
}

//extend class
class Water extends Drink {
	static char temp = '+';
	static float temperature = 20f;
	static String title = "Water";
	static boolean sugar = false;

	// polymorphism: OVERRIDING
	static void printInfo() {
		Drink.printInfo();
		System.out.printf("====== %s ======\n", Water.class.getName());
		System.out.printf("|Product:%9s|\n", title);
		System.out.printf("|Sugar: %10b|\n", sugar);
		System.out.printf("|Temperature:%1c%.1f|\n", temp, temperature);
		System.out.println("===================\n");
	}
}