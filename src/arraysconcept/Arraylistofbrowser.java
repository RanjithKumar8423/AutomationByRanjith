package arraysconcept;


import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistofbrowser {

	public static void main(String[] args) {
	ArrayList<String> browserlist=new ArrayList<String>(Arrays.asList("Chrome","Firefox","Edge"));
	System.out.println(browserlist.size());
	browserlist.add("IE");
	System.out.println(browserlist.size());
	System.out.println(browserlist.get(0));
	System.out.println(browserlist.indexOf("Firefox"));
   if(browserlist.indexOf("Chrome")==0) {
	   System.out.println("corect");
	   System.out.println("=-----------");
	   browserlist.removeAll(browserlist);
	   System.out.println(browserlist.size());
   
   }
	}

}
