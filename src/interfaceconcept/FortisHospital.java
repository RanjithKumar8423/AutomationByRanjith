package interfaceconcept;

//interface is 100% abstraction, all methods should be inheritted
//multiple interence possible, child class inherting the properties from multiple parents
//All veriable by default static and final
//we can do upcasting for interface

public class FortisHospital implements IndianMedical,UkMedical,usmedical {

	@Override
	public void physiosevices() {
		System.out.println("usmedical--physiosevices");
		
	}

	@Override
	public void ancologyservices() {
		System.out.println("usmedical--ancologyservices");		
	}

	@Override
	public void pedioservice() {
		System.out.println("usmedical--pedioservice");		
		
	}

	@Override
	public void bloodservices() {
		System.out.println("UkMedical--bloodservices");		
		
	}

	@Override
	public void xrayservices() {
		System.out.println("UkMedical--xrayservices");		
		
	}

	@Override
	public void prescriptionsevices() {
		System.out.println("IndianMedical--prescriptionsevices");		
		
	}

	@Override
	public void homenursingservices() {
		System.out.println("IndianMedical--homenursingservices");		
		
	}
	
	public void optservice() {
		System.out.println("Fortishospital--optservice");
		
	}

	@Override
	public void genetictesting() {
		System.out.println("WHo--genetictesting");
	}
	

}
