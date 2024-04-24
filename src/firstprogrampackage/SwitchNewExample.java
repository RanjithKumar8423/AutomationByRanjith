package firstprogrampackage;

public class SwitchNewExample {

	public static void main(String[] args) {
	String browser="Chrome";
	switch(browser.toLowerCase()) {
	case "chrome":
		System.out.println("it's chrome browser");
		break;
	case "Firefox":
		System.out.println("it's Firefox");
	default:
		System.out.println("no browser available");
	}
	
	}

}
