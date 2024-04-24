package passerbyreference;

public class PassingbyRefVariable {
	
	//by passing reference variable to static method
	String emp_name;
	int emp_age;
	public static void test(PassingbyRefVariable t1) {
		String s1=t1.emp_name;
		System.out.println(s1);
		System.out.println(t1.emp_age);
		t1.emp_name="TOM";
		t1.emp_age=28;
		System.out.println(t1.emp_age+" "+t1.emp_name);
		
	}
	public static void main(String[] args) {
		PassingbyRefVariable obj=new PassingbyRefVariable();
		obj.emp_name="ranjith";
		obj.emp_age=26;
		PassingbyRefVariable.test(obj);
		System.out.println(obj.emp_name +"  "+obj.emp_age);
	}
	

}
