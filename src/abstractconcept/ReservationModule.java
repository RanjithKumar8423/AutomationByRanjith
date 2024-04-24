package abstractconcept;
//we can't create object for abstract class
public class ReservationModule extends frontoffice {
	
	public ReservationModule() {
		System.out.println("passer by posting through ReservationModule");
	}
	public ReservationModule(int a) {
		System.out.println("wake call via res module: "+a);
	}

	@Override
	public void reservation() {
          System.out.println("i have reservationnumber");		
	}

	@Override
	public void rundayend() {
	      System.out.println("date chaning function");		
	}
	@Override
	public void configuration() {
		System.out.println("Navigating configuration module via ReservationModule");
	}
    public void createreservation() {
    	System.out.println("creating reservation");
    }
    public static void walkin() {
    	System.out.println("creating reservation with walkin");
    }
   

}
