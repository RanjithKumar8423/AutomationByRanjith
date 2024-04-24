package arraysconcept;

import java.util.ArrayList;

public class ArraysListConcept {

	public static void main(String[] args) {
	ArrayList ar =new ArrayList();
   System.out.println(ar.size());
   ar.add(100);
   ar.add(200);
   System.out.println(ar.size());
   System.out.println(ar);
   ar.remove(1);
   System.out.println(ar.size());
   System.out.println(ar);
   ar.add(55.56);
   System.out.println(ar);
   ar.add('w');
   ar.add("ranjith");
   System.out.println(ar);
	}

}
