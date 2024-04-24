package exceptionhandling;

public class ThrowKeyword {
	public static void main(String[] args) {
		
		String data=null;
		try {
		if (data==null) {
			throw new Exception("own expection has been created in java");
			
		}
		else {
			System.out.println("Data exits");
		}
		}
		catch (Exception e) {
        e.printStackTrace();
		}
		
	}

}
