package stringmutable;

public class StringLiterals {

	
	//creating string object and comparing their references and similar to literals too
	
	public static void main(String[] args) {
	
		
		String tr="selenium";
		tr=tr.concat("testing");
		System.out.println(tr);
		int i=20;
		i=i+10;
		System.out.println(i);
		String s2="Hello";
		String s3="hello";
		System.out.println(s2==s3);
		String s4=new String("World");
		String s5="World";
		
		System.out.println(s4.equals(s5));
		String s6=new String("ranjith");
		String s7=new String("ranjith");
		String s8="ranjith";
		System.out.println(s6.equals(s7));
		System.out.println("    "+s7.equals(s8));
		System.out.println("****************************************");
		StringBuilder sb=new StringBuilder("Dell");
		sb.append("laptop");
		System.out.println(sb);
		//System.out.println(st);





	}

}
