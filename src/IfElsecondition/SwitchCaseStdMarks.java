package IfElsecondition;

public class SwitchCaseStdMarks {
	// passing student name and their marks
	
	public int stdmarks(String stdname) {
		System.out.println("fetching student name  :-"+stdname);
		
		switch (stdname.toLowerCase().trim()) {
		case "ranjith":
			return 90;
		case "pallavi":
			return 94;

		default:
			System.out.println("std name not found");
			return -1;
		}
	}
	public static void main(String[] args) {
		SwitchCaseStdMarks sm=new SwitchCaseStdMarks();
		int s=sm.stdmarks("PALLAVI  ");
		System.out.println(s);
	}

}
