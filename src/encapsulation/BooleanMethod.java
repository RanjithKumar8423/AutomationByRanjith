package encapsulation;

public class BooleanMethod {
	
	//private String username;
	
	int age;
	
	public void dologin() {
    if( test(age)) {
    	System.out.println("logged in");
    }
    else {
    	System.out.println("sry");
    }
	}
	
	public boolean test(int age) {
		System.out.println("staring 1st line");
		boolean flag=true;
		System.out.println(flag);
		return flag;
	}

}
