package encapsulation;

public class EmpTest {

	public static void main(String[] args) {
//		EmployeeData emp=new EmployeeData();
//		emp.setname("mmmkk");
//		emp.setsalary("9000");
//		System.out.println(emp.getname()+"  " + emp.getsalary());
//		Encapsulation2 obj=new Encapsulation2();
//		obj.setresno(67);
//		obj.setroomno(5959);
//		obj.setgstname("pankaja");
//		String rt=obj.getgstname();
//		System.out.println(rt);
		ConstructorEncaps obj=new ConstructorEncaps(55, "ranjith");
		String msg=obj.getguestname();
		int msg1=obj.getresno();
		System.out.println(msg+" "+msg1);
		obj.setresno(67);
        System.out.println(obj.getresno());
        obj.guestcheck();

	}

}
