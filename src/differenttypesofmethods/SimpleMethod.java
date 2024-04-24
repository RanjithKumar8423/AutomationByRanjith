package differenttypesofmethods;

public class SimpleMethod {

	
	public String test() {
		System.out.println("Strating line");
		return "hello";
	}
	
	public static void main(String[] args) {
		
	SimpleMethod s=new SimpleMethod();
	String ss=s.test();
	System.out.println(ss);

	
	}

}
