package builderpattern;

//calling inside the method by point current class of object by return this keyword
//creating different method

public class EcommerceApplication {
	
public EcommerceApplication dologin(String un, int pwd) {
	System.out.println("Logining with:  "+un+" & "+pwd);
	return this;
}
public EcommerceApplication dologin(String un, int pwd, String role) {
	System.out.println("Logining with:  "+un+" & "+pwd+", Role: "+role);
	return this;
}
public EcommerceApplication Search(String productname) {
	System.out.println("SEarched  product:  "+productname);
	return this;
}
public EcommerceApplication Search(String productname, String color) {
	System.out.println("SEarched  product with color");
	return this;
}
public EcommerceApplication addtocart(String productname) {
	System.out.println("added to cart  product:  "+productname);
	return this;
}
public EcommerceApplication payment(double upi) {
	System.out.println("payment doing through upi");
	return this;
}
public EcommerceApplication orderid(int id) {
	System.out.println("got order id");
	return this;
}
public EcommerceApplication logout() {
	System.out.println("Logout done");
	return this;
}

}
