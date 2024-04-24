package differenttypesofmethods;

//static method overloading
//accessing static methods inside non static method and vice versa 
//static and Non static Method

public class MethodChaining {
	
	public static void test() {
		System.out.println("Zero parameter input");
	} 
	
	public static void test(int a) {
		System.out.println("one parameter input with Integer");
		System.out.println("Passed reference variable: "+a);
	} 
	public static void test(String a) {
		System.out.println("one parameter input with String");
		System.out.println("Passed reference variable: "+a);
		
	} 
	public static void test(String a, int b) {
		System.out.println("one parameter input with String and integer");
		System.out.println("Passed reference variable: "+a+" & "+b);
		MethodChaining obj=new MethodChaining();
		obj.m2();
	} 
	public static void t1() {
		System.out.println("t1 static method");
		test();
		test(12);
		test("hi");
	} 
	public static void t2() {
		System.out.println("t2 static method");
	}
	public  void m1() {
		System.out.println("m1 Non static method");
		t2();
		test("Ranjith", 26);
	}
	public  void m2() {
		System.out.println("m2 Non static method");
	} 
	
	
	
	
	
	
	
	
	
	
	

}
