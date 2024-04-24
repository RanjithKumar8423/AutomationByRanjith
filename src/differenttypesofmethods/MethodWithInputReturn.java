package differenttypesofmethods;

//method with some input in parameter and return type as non void

public class MethodWithInputReturn {
	
	public double generateBill(int bill, double discount ) {
		System.out.println("Welcome to xandari hotel");
		double finalBill=bill-discount;
		return finalBill;
		
	}
	public int generateBill(int bill, int discount ) {
		System.out.println("Welcome to myfari hotel");
		int finalBill=bill-discount;
		return finalBill;
		
	}
	public String generateBill(String BB, int amount ) {
		System.out.println("Welcome to mycafee hotel");
		System.out.println("order BreakFast:  "+BB+",  amount was: "+amount);
		String BB1="Dosa";
		String BB2=BB1.concat(" sambar");
		double mesg=generateBill(34, 4.5);
		System.out.println("final amount of xandari hotel: "+mesg);
		return BB2;
		
	}
	public Boolean generateBill(boolean isactive ) {
		System.out.println("Welcome to bangaore hotel");
		System.out.println(isactive);
		return true;
	}
}
