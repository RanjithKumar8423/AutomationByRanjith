package encapsulation;

public class ConstructorEncapsulationtest {

	public static void main(String[] args) {
		ConstructorEncapsulation c1=new ConstructorEncapsulation("Ranjith", 26);
	   int s1=c1.getage();
	  String s2= c1.getname();
	  System.out.println(s1+"   "+s2);
		c1.setage(27);
		c1.setname("kumar");
		
	  System.out.println(c1.getage()+"   "+c1.getname());
	}

}
