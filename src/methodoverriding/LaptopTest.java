package methodoverriding;

public class LaptopTest {

	public static void main(String[] args) {
         HPLaptop1 obj=new HPLaptop1();
         obj.ac();
         obj.hpbrand("ranjith");
         obj.hpbrand(7);
        System.out.println( obj.price);
      Laptop obj1= new HPLaptop();
      obj1.i3();
    Electronics obj2= new Laptop();
    obj2.dc();
	}

}
