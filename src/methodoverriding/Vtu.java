package methodoverriding;

public class Vtu extends UniversityOverriding {
	
	public void sjcit() {
		System.out.println("sjcit college under vtu");
	}
	public void bit() { //inherriting
		System.out.println("Bit college under vtu");
	}
	@Override
	public void Revaunversity() {
		System.out.println("These is Reva unversity with partially from vtu exam");
	}
	@Override
	public void cambridgeunversity() {
		System.out.println("These is Cambridge unversity with partially from vtu exam");
	}
	

}
