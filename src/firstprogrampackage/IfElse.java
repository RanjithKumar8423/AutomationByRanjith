package firstprogrampackage;

public class IfElse {

	public static void main(String[] args) {
	int a=25;
	int b=78;
	int c=87;
	int d=101;
  if(a>=b && a>=c && a>=d ) {
	  System.out.println(a);
  }
  else if(b>=a && b>=c && b>=d ) {
	  System.out.println(b);
  }	
  else if(c>=a && c>=b && c>=d){
	  System.out.println(c);
  }
  
  else  {
	  System.out.println(d);
	  
  }
	
	}

}
