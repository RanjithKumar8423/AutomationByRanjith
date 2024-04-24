package firstprogrampackage;

public class LoanInterest {

	public static void main(String[] args) {
	String loanname= "Home loan";
	int salary=30000;
	int loaninterest;
	
	switch (loanname) {
	case "Home loan":
	loaninterest=6;
		break;
	case "Office loan":
	loaninterest=4;
		break;
	case "Car loan":
	if(salary<30000) {
		System.out.println("not applicable");
		return;
	}
	loaninterest=6;
		break;

	default:
		System.out.println("None of above");
		return;
		//break;
	}
System.out.println("interest of" +loanname+ " is "+loaninterest+ "mn");
	}

}
