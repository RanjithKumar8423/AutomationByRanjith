package switchcases;

public class NestedSwitchCase {

	public static void main(String[] args) {
	String browser="chrom";
	int version=94;
	
	switch(browser) {
	  case "chrome":
		  System.out.println("chrome was lanuched");
	    switch(version){
	      case 90:
		      System.out.println("chrome browser 90 version");
		      break;
	      case 91:
		      System.out.println("chrome browser 91 version");
		      break;
	      case 92:
			  System.out.println("chrome browser 92 version");
			  break;
		  default:
			  System.out.println("chrome none of above");
			  break;
				  
	
	      }
	    
	    break;
	  case "Firefox":
		  switch(version){
	      case 93:
		      System.out.println("Firefox browser 93 version");
		      break;
	      case 94:
		      System.out.println("Firefox browser 94 version");
		      break;
	      case 95:
			  System.out.println("Firefox browser 95 version");
			  break;
	      default:
			  System.out.println("Firefox none of above");
			  break;
	
	      }
		  default:
			  System.out.println("pls pass correct browser");
		  break;
		  
	}
	
	

	}

}
