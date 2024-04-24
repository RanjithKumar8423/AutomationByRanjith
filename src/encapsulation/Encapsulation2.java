package encapsulation;

//accessing private instance variable through constructor with this keyword and return in method(get and set)

public class Encapsulation2 {
	private int resno;
	private double roomno;
	private String gstname;
	
	public int getresno() {
		return resno;
	}
	public void setresno(int resno) {
		this.resno=resno;
		
	}
    public double getroomno() {
		return roomno;
	}
    public void setroomno(int roomno) {
		this.roomno=roomno;
	}
    public String getgstname() {
		return gstname;
	}
    public void setgstname(String gstname) {
    	this.gstname=gstname;
    	
		
	}
	
	

}
