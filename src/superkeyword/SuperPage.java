package superkeyword;

// overridden conncept :- create parent classes and child classes with multiple method and call parent method with super keyword

public class SuperPage {

	public final int dtu=60;
	
	public void pagepanel() {
		System.out.println("Super page panel");
	}
	public void pagesetup() {
		System.out.println("Super page pagesetup");
	}
	public final void logo() {
		System.out.println("Super page logo with final");
	}
	public  void logo(String a) {
		System.out.println("Super page logo with ids");
		System.out.println("logo of company   "+a);
	}
	
	
}
