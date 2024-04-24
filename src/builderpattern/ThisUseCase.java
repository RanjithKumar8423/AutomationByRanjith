package builderpattern;

public class ThisUseCase {
	String username;
	String password;
	 
	public void dologin(String username, String password) {
		System.out.println("user credentials : "+username+" & "+password);
		System.out.println("user logged in by using above credentials");
		this.password=password;
		this.username=username;
	}
	public ThisUseCase justcheckingpwdun() {
	System.out.println("user credentials : "+username+" & "+password);
	return this;
	
	}
	public void justcheckingpwdun(String username, String password) {
		System.out.println("user credentials : "+username+" & "+password);
		this.username=username;
		this.password=password;
		againjustcheckingpwdun();
		}
	public void againjustcheckingpwdun() {
		System.out.println(" Again user credentials : "+username+" & "+password);
		
		
		}

}
