package differenttypesofmethods;


//By using if else printing respective hotel, By using method with single parameter input calling in main method by variable data

public class MethodWithIfElseHotel {
	String GuestName;
	public int hotelName(String hotel) {
		System.out.println("Hotel Name is:  "+hotel);
		if (hotel.trim().equalsIgnoreCase("greenpark")) {
			GuestName="Ranjith";
			return 3000;
			
		}
		else if (hotel.trim().equalsIgnoreCase("tajhotels")) {
			GuestName="Pallavi";
			return 6000;
			
		}
		else if (hotel.trim().equalsIgnoreCase("xandari")) {
			GuestName="pankaja";
			return 2000;
			
		}

		else {
			System.out.println("Hotel not found and Guest empty");
			GuestName=null;
			return 0;
		}

	}
	

}
