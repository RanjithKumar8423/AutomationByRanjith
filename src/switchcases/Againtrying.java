package switchcases;

public class Againtrying {

	public static void main(String[] args) {
	
	String browser="Chrome ";
	switch (browser.trim().toLowerCase()) {
	case "chrome":
		System.out.println("Chrome it's");
		break;
	case "Firebox ":
		System.out.println("firefox it's");
		break;

	default:
		System.out.println("pass ryt browser");
		break;
	}

	}

}
