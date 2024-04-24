package firstprogrampackage;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
	
	int a=-98;
	int b=a++;
	System.out.println(a);
	System.out.println(b);
	
	int c=2;
	int d=c--;
	System.out.println(c);
	System.out.println(c++);
	System.out.println(d);
	System.out.println(c);
	System.out.println("next line ");
	int m=1;
	int n= ++m + ++m;
	System.out.println(m);
	System.out.println(n);
	}

}
