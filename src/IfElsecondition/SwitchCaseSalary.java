package IfElsecondition;

public class SwitchCaseSalary {
	//passing employee name and getting them salary
	public int company(String empname) {
		System.out.println("Employee name:- "+empname);
		switch (empname.trim().toLowerCase()) {
		case "ranjith":
			return 9700;
			
		case "pallavi":
			return 9000;
			
		case "sumriya":
			return 9400;

		default:
			System.out.println("Employee name not found"+ empname);
			return -1;
		}
		
	}
	public static void main(String[] args) {
		SwitchCaseSalary scs=new SwitchCaseSalary();
		int s1=scs.company("RANJITH ");
		System.out.println(s1);
		if (s1==-1) {
			System.out.println("no need to print marks card");
		}
		else {
			System.out.println("print marks card");
		}
	}

}
