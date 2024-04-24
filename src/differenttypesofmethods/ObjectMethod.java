package differenttypesofmethods;

import java.util.Arrays;

public class ObjectMethod {

public String[] getdevice() {
	System.out.println("First line");
	String[] devices= {"iphone","oneplus","oppo"};
	return devices;
}
	
	
	
	public static void main(String[] args) {
		ObjectMethod ob=new ObjectMethod();
		String[] ss=ob.getdevice();
		System.out.println(Arrays.toString(ss));

	}

}
