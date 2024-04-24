package encapsulation;

public class DoLoginMethod {
	private String username;
	private String password;
	
	public DoLoginMethod(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public void setusername(String username) {
		this.username=username;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	
	public void dologin(String username) {
		if (isuservalid()) {
		System.out.println("users enters un    :-"+ username);
		System.out.println("users enters pswd  :-"+password);
		System.out.println("user logged in");
	}
		else {
			System.out.println("sry");
		}
	}
	public boolean isuservalid() {
		System.out.println("checking username pls wait");
		if (username.length()>=3) {
			System.out.println("user valid pls continue");
			return true;
		}
		else {
			System.out.println("user not valid");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
