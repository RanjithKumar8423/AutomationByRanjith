package stringmutable;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("String sequence :");
		boolean ba=false;
		appendTobooleantoString(sb, ba);
		System.out.println("Final Sequence="+sb.toString());
    
	}

	public static void appendTobooleantoString(StringBuilder sb, boolean ba) {
		sb.append(ba);

		
	}

}
