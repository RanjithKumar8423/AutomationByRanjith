package constructor;

public class ConstructorThis {
 //employee detais and print through constructor
	String empname;
	int empage;
	double empsalary;
	
	public ConstructorThis(String empname, int empage, double empsalary) {
		this.empname=empname;
		this.empage=empage;
		this.empsalary=empsalary;
	}
	public static void main(String[] args) {
		ConstructorThis obj=new ConstructorThis("ranjith",26, 28.00);
		System.out.println(obj.empsalary+""+obj.empname);
		
	}
}
