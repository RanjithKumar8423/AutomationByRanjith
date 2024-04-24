package abstractconcept;

public class TestFrontOffice {

	public static void main(String[] args) {
    
		ReservationModule rm=new ReservationModule(10);
		rm.configuration();
		rm.rundayend();
		rm.propertysetting();
	    frontoffice.leftmenu();
	    ReservationModule.walkin();
	    rm.createreservation();
	}

}
