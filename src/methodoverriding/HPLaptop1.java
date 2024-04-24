package methodoverriding;

public class HPLaptop1 extends HPLaptop {
	
	public void hpbrand(String a) {
		System.out.println(a);
		System.out.println("hp laptop1");
	}
	public void hpbrand(int a) {
		System.out.println(a);
		System.out.println("hp laptop12");
	}

}
