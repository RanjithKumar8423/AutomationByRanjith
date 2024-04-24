package constructor;

public class TestConstructorChaining {

	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining(1,101);
		System.out.println("Guest Reservation Number: "+obj.ResNo+", Guest Room Number: "+obj.RoomNo);

		ConstructorChaining obj1=new ConstructorChaining(34, 330, 'M');
		System.out.println("Guest Reservation Number: "+obj1.ResNo+", Guest Room Number: "+obj1.RoomNo+ ", Guest gender: "+obj1.gender);
        
	}

}
