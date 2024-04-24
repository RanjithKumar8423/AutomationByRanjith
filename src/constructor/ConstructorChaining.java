package constructor;

public class ConstructorChaining {
	
	int ResNo;
	double RoomNo;
	String RoomType;
	String GuestName;
	char gender;
	Boolean Checkin;
	
	public ConstructorChaining(int ResNo, double RoomNo ) {
	this(23, 45.4, "suite");
	this.ResNo=ResNo;
	this.RoomNo=RoomNo;
		
	}
    public ConstructorChaining(int ResNo, double RoomNo, String RoomType ) {
    	 System.out.println("calling 2nd const");
    	this.ResNo=ResNo;
    	this.RoomNo=RoomNo;
    	this.RoomType=RoomType;
    	System.out.println(RoomNo+"  "+ResNo+" "+RoomType);
		
	}
    public ConstructorChaining(int ResNo, double RoomNo, char gender ) {
	this.gender=gender;
	this.ResNo=ResNo;
	this.RoomNo=RoomNo;
	
		
	}
    public ConstructorChaining(int ResNo, double RoomNo, char gender, Boolean Checkin ) {
    this.Checkin=Checkin;
    this.gender=gender;
	this.ResNo=ResNo;
	this.RoomNo=RoomNo;
	
		
    	}
	

}
