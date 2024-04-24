package methodoverloading;

public class FunctionsOverLoadingTest {

	public static void main(String[] args) {
		FunctionsOverLoading obj=new FunctionsOverLoading();
//		String s1=obj.payment("payment done via cash");
//		System.out.println(s1);
		obj.payment(12, 34);
		obj.payment(34, 3.4);
		obj.payment("paypalid");
		int s2=obj.payment(1);
		System.out.println(s2+34);
	}

}
