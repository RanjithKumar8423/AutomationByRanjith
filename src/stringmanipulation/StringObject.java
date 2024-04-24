package stringmanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringObject {

//String point addressing to object in scp
	public static void main(String[] args) {

		
		String name="     Test           automation labs      ";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String rs=name.replaceAll("\\s+", "");
		System.out.println(rs);
		
	String prdid="testing product id is 12344";
	String rs1=prdid.replaceAll("\\d+", "");
	System.out.println(rs1);
	// we need to handle separately
	String prdid1="testing product id is 12344 and oderid 234445";
	Pattern patt=Pattern.compile("\\d+");
	Matcher matcher=patt.matcher(prdid1);

	if (matcher.find()) {
		String userid=matcher.group();
		System.out.println(userid);
	}
	if (matcher.find()) {
		String oid=matcher.group();
		System.out.println(oid);
	}
	
	}

}
