package differenttypesofmethods;

public class Methodsofextra {
	
	public String test(String a, String b) {
	System.out.println("starting line.");
	String result=a +" weds "+ b;
	return result;
	}
    
	public int test1() {
		System.out.println("staring 2nd line");
		return 200;
	}
	
	public boolean test() {
	System.out.println("staring 3rd line");
	return true;
	}
	
	public Object[] test(int marks, int extra, double discmarks) {
		System.out.println("staring 4th line");
		double finalmarks=marks+extra-discmarks;
		String  college="BGS";
		boolean stdtype=true;
		Object stddetails[]= {finalmarks,stdtype,college};
		return stddetails;
	}
	
	public String[] getdevice() {
	System.out.println("staring 5th line");
	String[] list= {"Apple", "MAC","iphone"};
	return list;
	}

	}

	

