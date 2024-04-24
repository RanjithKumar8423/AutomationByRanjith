package methodoverloading;

public class FunctionsOverLoading {
	//methodoverloading--methodname should be same but variation in arguments
	//payment example
	public void payment(int cc, int cvv) {
		System.out.println("payment as done through cc and cvv");
	}
	public void payment(int phonepay, double googlepay) {
		System.out.println("payment as done through phonepay and googlepay");
	}
//	public String payment(String cash) {
//		System.out.println("payment as done through cash");
//		return cash;
//	}
	public void payment(String paymenttype) {
		switch (paymenttype) {
		case "upi":
			System.out.println("payment has been done via upi");
			break;
		case "paypalid":
			System.out.println("payment has been done via paypalid");
			break;

		default:
			System.out.println("payment has been not matched");
			break;
		}
	}
	public int payment(int single) {
		switch (single) {
		case 1:
			System.out.println("one rupees");
			break;
		case 2:
			System.out.println("two rupees");
			break;

		default:
			System.out.println("nothing");
			break;
		}
		return single;
		
		
		
	}

}