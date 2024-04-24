package builderpattern;


//declaring some instance variable in class and returning those variable in method and giving data through constructor

public class ReturnKeword {
	
	public int reservationNumber;
	public double roomNumber;
	private String guestName;
	
	public ReturnKeword(int reservationNumber, double roomNumber, String guestName) {
		System.out.println(reservationNumber+"  "+roomNumber+"   "+guestName);
		this.reservationNumber=reservationNumber;
		this.roomNumber=roomNumber;
		this.guestName=guestName;
	}
	public String getresNo(int a) {
		System.out.println(a);
		return guestName;
		
	}

}
