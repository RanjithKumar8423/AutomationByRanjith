package differenttypesofmethods;

import java.util.ArrayList;

public class ArraysListMethod {
	
	public ArrayList<String> getuserlist() {
		System.out.println("Lists is here");
		ArrayList<String> userlist=new ArrayList<String>();
		userlist.add("Ranjith");
		userlist.add("pallavi");
		userlist.add("sumriya");
		userlist.remove(2);
		return userlist;
	}
	
	public static void main(String[] args) {
		ArraysListMethod am=new ArraysListMethod();
		ArrayList<String> s1=am.getuserlist();
		System.out.println(s1);
	}

}
