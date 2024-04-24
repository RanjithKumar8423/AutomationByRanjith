package superkeyword;

public class SuperWebPage extends SuperPage {
	
	public int dtu=100;
	
	public SuperWebPage() {
		System.out.println("Super webpage");
	}
	
	public SuperWebPage(int a) {
		System.out.println("super web page dut    "+a);
		System.out.println("Super webpage with parameter");
	}
	@Override
	public void pagepanel() {
		super.pagepanel();
		super.pagesetup();
		System.out.println(super.dtu);
		System.out.println(this.dtu);
		System.out.println("superwebpage called overridden");
	}
	


}
