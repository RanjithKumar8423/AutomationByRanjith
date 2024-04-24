package methodoverriding;

public class Laptop extends Electronics {
	
	int price=38000;
	
	public void i3() {
		System.out.println("i3 Laptop");
	}
	public void i5() {
		System.out.println("i5 Laptop");
	}
	public void i7() {
		System.out.println("i7 Laptop");
	}
	@Override
	public void dc() {
		System.out.println("dc Laptop");
	}

}
