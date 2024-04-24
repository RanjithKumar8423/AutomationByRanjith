package exceptionhandling;

public class Employee {

	public void m1(int a, int b) {
		System.out.println("m1 printed");
		System.out.println(a+"  "+b);
		m2(3,0);
	}
	public void m2(int a, int b) {
		System.out.println("m2 printed");
		System.out.println(a+"  "+b);
		try {
		m3(a, b);
		}
		catch (Exception e) {
			System.out.println("handled");
			e.printStackTrace();
		}

	}
	public void m3(int a, int b)  {
		System.out.println("m3 printed");
		System.out.println(a+"  "+b);
		int i=a/b;
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.m1(23, 7);
		Employee.test(12,0);
	}
	
    public static void test(int a, int b) {
	try {
	int c=a/b;
	}
	catch(ArithmeticException e) {
		System.out.println("static handled");
		e.printStackTrace();
		
	}
	
}
	
}
