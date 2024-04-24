package IfElsecondition;

public class BooleanSwitchBrowser {
	
//passing the browser name and print that browser by using boolean return type(yes or no option)
	
	public boolean browser(String bwsrname) {
		switch (bwsrname.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome has been launched");
			return true;
		case "firefox":
			System.out.println("firefox has been launched");
			return true;
		case "micsoftedge":
			System.out.println("micsoftedge has been launched");
			return true;
		case "opera":
			System.out.println("opera has been launched");
			return true;

		default:
			System.out.println("searched browser not available there THANKS.."+bwsrname);
			return false;
		}
	}
	public static void main(String[] args) {
		BooleanSwitchBrowser obj=new BooleanSwitchBrowser();
		boolean s1=obj.browser("opera ");
		System.out.println(s1);
		if (s1==true) {
			System.out.println("pls pass the url");
		}
		else {
			System.out.println("pls check internet connectivity");
		}
	}

}
