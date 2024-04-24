package IfElsecondition;

import java.util.ArrayList;

public class SwitchCaseArrayList {
	
	//passing student name and getting them marks with Arrays list
	public ArrayList<String> student(String stdname) {
		System.out.println("Student name :- "+stdname);
		ArrayList<String> subject=new ArrayList<String>();
		switch (stdname.trim().toLowerCase()) {
		case "ranjith":
			subject.add("Maths");
			subject.add("HT");
			subject.add("MES");
			break;
		case "pallavi":
			subject.add("English");
			subject.add("KOM");
			subject.add("DOM");
			break;
		case "Sumriya":
			subject.add("HR");
			subject.add("FP");
			subject.add("EE");
			break;

		default:
			System.out.println("No student has been matched.. plsease correct stdname"+stdname);
			break;
		}
		return subject;
	}
	public static void main(String[] args) {
		SwitchCaseArrayList obj=new SwitchCaseArrayList();
		ArrayList<String> list=obj.student("RANJITH");
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
