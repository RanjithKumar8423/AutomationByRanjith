package abstractconcept;

//Abstraction means we can have abstract method and non abstract method inside abstract class and constructor 
//abstraction achieve only in inheritance by extends
//constructor-->it will call always default const in parent abs const if created parameterized const in child class level and we do upcasting
public abstract class frontoffice {
	
	public frontoffice() {
		this(5);
		System.out.println("passer by posting");
	}
	public frontoffice(int a) {
		System.out.println("wakeups calls: "+a);
	}
	
	public abstract void reservation();
	public abstract void rundayend();
	
	public void configuration() {
		System.out.println("i have all setting RE: front office");
	}
	public static void leftmenu() {
		System.out.println("some basic configuration with static ");
	}
	public final void propertysetting() {
		System.out.println("some setting enable with final keyword");
	}

}
