package arraysconcept;

import java.util.Arrays;
import java.util.Iterator;

public class OjectArray {

	public static void main(String[] args) {
		Object empdata[]=new Object[4];
		empdata[0]="Ranjith";
		empdata[1]=344;
		empdata[2]=3.4;
		empdata[3]=true;
	for (int i = 0; i < empdata.length; i++) {
	if(empdata[i].equals(true)){
		System.out.println(empdata[i]);
	break;	
	}


	}

}}
