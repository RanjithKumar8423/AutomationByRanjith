package IfElsecondition;

public class StudentMarks {
	//passing student name and print them marks in console
	public int studenttest(String name) {
		System.out.println("Student name   :-"+name);
		int marks=-1;
		if (name.trim().equalsIgnoreCase("Ranjith")) {
		 marks=90;
		}
		else if (name.trim().equalsIgnoreCase("pallavi")) {
			 marks=94;
			}
		else if (name.trim().equalsIgnoreCase("Sumriya")) {
			 marks=91;
			}
		else  {
			System.out.println("student marks not found..pls the marks");
			}
		return marks;
		
	}
	public static void main(String[] args) {
		StudentMarks sm1=new StudentMarks();
		int s1=sm1.studenttest("pallavi ");
		System.out.println(s1);
		
	}

}
