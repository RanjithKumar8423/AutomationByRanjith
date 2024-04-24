package superkeyword;

public class SuperHomePage extends SuperWebPage {
	
	public int dtu=120;
	
	public SuperHomePage() {
		System.out.println("superhome page called");
	}
	public SuperHomePage(int a) {
		super();
		System.out.println("Super Homepage with parameter called");
	    System.out.println(a);
	}
	
	public void components() {
		super.pagepanel();
		super.logo();
		super.logo("ids");
		System.out.println("All components available with superhome page");
	}
	

}
