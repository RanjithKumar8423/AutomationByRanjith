package encapsulation;

public class ConstructorEncapsulation {
	
	private String name;
	private int age;
	public ConstructorEncapsulation(String name, int age) {
		this.name=name;
		this.age=age;
	}
		public void setname(String name) {
			this.name=name;
		}
		public void setage(int age) {
			this.age=age;
		}
		public int getage() {
			return age;
		}
		public String getname() {
			return name;
		
	}

}
