package methodoverriding;

public class DellLaptop extends Laptop {
	public int price=80000;
	
	public void delllate() {
		System.out.println("latitude dell laptop");
	}
	public void dell256() {
		System.out.println("dell256 laptop");
	}
	@Override
	public void i7() {
		System.out.println("i7 Laptop");
	}
	@Override
	public void dc() {
		System.out.println("dc Laptop");
	}

}
