package differenttypesofmethods;

public class ParametersMethod {
	
	
	//passer by value or calling the method by passing value
	//2parameter with return type
	public int test(int a, int b) {
	System.out.println("strating line");
	int c=a*b;
	return c;
	}
	public int test(int a) {
		System.out.println("strating 2nd line");
		int r=a;
		return r;
		}

	public static void main(String[] args) {
		
		ParametersMethod pa=new ParametersMethod();
		int bb=pa.test(2, 4);
		System.out.println(bb-4);
		int cc=pa.test(45);
		System.out.println(cc-8);

	}

}
