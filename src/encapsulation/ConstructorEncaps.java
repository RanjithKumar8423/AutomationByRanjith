package encapsulation;
//accessing private member through constructor
public class ConstructorEncaps {

	private int resno;
	private String guestname;
	
	public ConstructorEncaps(int resno, String guestname) {
		this.resno=resno;
		this.guestname=guestname;
	}
	public int getresno() {
		return resno;
	}
	public String getguestname() {
		return guestname;
	}
	public void setresno(int resno) {
		this.resno=resno;
		
	}
	public void guestcheck() {
		if(isvalid(guestname)) {
			System.out.println("Guest Name is valid: "+guestname);
			System.out.println("Reservation has been created with give guest name");
		}
//		else {
//			System.out.println("not valid");
//		}
	}
	
	private boolean isvalid(String guestname) {
		System.out.println("checking..");
		if(guestname.length()>8) {
			return true;
		}
		else {
			
			System.out.println("guest name not valid");
			return false;
		}
		
	}
}
