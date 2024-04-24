package exceptionhandling;

//passing illegal statement during execution catching those try and catch

public class TryCatch {
	
	String name;
	
	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hi");
try {
		
	int a=9/0;
	
} catch (NullPointerException e) {
	  System.out.println("expection is coming... and expection has been handled");
	e.printStackTrace();
}

  catch ( ArithmeticException e) {
	  System.out.println("Airthmetic expection has been handled");
	  e.printStackTrace();
}
      System.out.println("Bye");
  
      TryCatch obj=new TryCatch();
  	obj=null;
 	try {
  	String name1=obj.name="ranjith";
  	System.out.println(name1);
	}
   	catch (NullPointerException e) {
   		e.printStackTrace();
   	  	System.out.println("null expection handled");

	}

} } 
