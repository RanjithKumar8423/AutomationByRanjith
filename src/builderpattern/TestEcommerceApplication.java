package builderpattern;

public class TestEcommerceApplication {

	public static void main(String[] args) {
//		EcommerceApplication obj=new EcommerceApplication();
//		obj.dologin("Niki", 1234).
//		dologin("puma", 4321, "Maganer")
//		.Search("shoes")
//		.addtocart("shoes with 9inches");
//		ThisUseCase obj=new ThisUseCase();
//		obj.dologin("ids", "Ids@q123");
//		obj.justcheckingpwdun().justcheckingpwdun("opentech", "openTech@123");
		ReturnKeword obj=new ReturnKeword(5, 123, "pallavi");
		String rt=obj.getresNo(34);
		System.out.println(rt);

	}

}
