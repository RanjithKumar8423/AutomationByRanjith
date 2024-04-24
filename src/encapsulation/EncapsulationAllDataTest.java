package encapsulation;

public class EncapsulationAllDataTest {

	public static void main(String[] args) {
		EncapsulationAllData e=new EncapsulationAllData();
		e.setname("Ranjith");
		e.setage(26);
		String s=e.getname();
		int s1=e.getage();
		System.out.println(s);
		System.out.println(s1);

	}

}
