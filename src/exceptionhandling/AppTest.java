package exceptionhandling;
// by using if else condition launching different browser
public class AppTest {

	public static void main(String[] args) {
		
		String browser="ie";
		if (browser.equals("chrome")) {
			System.out.println("Chrome has been launched");
					}
		else if  (browser.equals("firefox")) {
			System.out.println("Chrome has been launched");
					}
		else if  (browser.equals("safari")) {
			System.out.println("safari has been launched");
					}
		else {
			System.out.println("Pls pass right brwoser to launch");
		    throw new MyExpection("Wrong browser exception");
		}
		System.out.println("Launch URL");

		
	}

}
