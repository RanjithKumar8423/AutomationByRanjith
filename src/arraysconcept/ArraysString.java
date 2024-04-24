package arraysconcept;

import java.util.ArrayList;

public class ArraysString {

	public static void main(String[] args) {
//	ArrayList<String> marklist=new ArrayList<String>();
//	marklist.add("maths");
//	marklist.add("science");
//	marklist.add("kannada");
//	System.out.println(marklist.size());
//	System.out.println(marklist);
	
	ArrayList<Object> empdata=new ArrayList<Object>();
	empdata.add("Ranjith");
	empdata.add('M');
	empdata.add(9599);
	empdata.add(true);
	empdata.add(43.4);
	System.out.println(empdata.size());
	System.out.println(empdata);
	for (Object e : empdata) {
	if(e.equals('M'))
		System.out.println(e);
		break;
	}
	}

}
