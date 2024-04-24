package methodoverriding;

public class HPLaptop extends Laptop {
	
	public int price=90000;
	
	public void hp123() {
		System.out.println("Hp Laptop");
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
