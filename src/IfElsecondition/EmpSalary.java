package IfElsecondition;

public class EmpSalary {
	
	
	public double employeesalary(String name) {
		System.out.println("EmployeeName  :-"+name);
		double salary=-1;
		if (name.trim().equalsIgnoreCase("Ranjith")) {
			salary=2000.4555;
		}
		else if (name.trim().equalsIgnoreCase("pallavi")) {
			salary=3000;
		}
		else if (name.trim().equalsIgnoreCase("Sumriya")){
			salary=4000;
		}
		else {
			System.out.println("please pass right employee");
		}
		double a=salary+200;
		System.out.println(a*2);
		return a;
	}
	
	public static void main(String[] args) {
		EmpSalary es=new EmpSalary();
		double s=es.employeesalary("ranjith");
		System.out.println("salary   ="+s);
		
	}

}
