package stringmutable;

public class FinallyBlock {

	
	// byusing if else condition passing exception
	
	public static int getmarks(String stdname) {
		
		System.out.println("Student name  :"+stdname);
		
		if (stdname.equals("ram")) {
			System.out.println("entered if condition:   "+stdname);
			return 95;
		}
		else if (stdname.equals("krish")) {
			System.out.println("entered if condition:  "+stdname);
			try {
			int i=9/0;
			return 9;
			}
			catch (ArithmeticException e) {
				System.out.println("handle exception here");
				return 5;
				}
			finally {
				System.out.println("mandatory");
				return 7;
			}
			
		}
		else {
			System.out.println("pls pass corect name");
			return -1;
		}
		
	}
	public static void main(String[] args) {
		int m=getmarks("krish");
		System.out.println("marks got  :"+m);
	}
	

}
