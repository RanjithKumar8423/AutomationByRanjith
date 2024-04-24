package differenttypesofmethods;

import java.util.Arrays;

public class MethodsofextraTest {
	  public static void main(String[] args) {
		  Methodsofextra m1=new Methodsofextra();
		String ss= m1.test("Ranjith", "Thanu");
		System.out.println(ss);
		int s2=m1.test1();
		System.out.println(s2);
		boolean s3=m1.test();
		System.out.println(s3);
		Object[] s4=m1.test(35, 12, 0.2);
		System.out.println(Arrays.toString(s4));
		String[] s5=m1.getdevice();
		System.out.println(Arrays.toString(s5));
		System.out.println(s5.length);
		
	}

}
