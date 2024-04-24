package arraysconcept;

import java.util.Arrays;

public class ArrayFirst {

	public static void main(String[] args) {
	
	int i[]=new int[4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
//	System.out.println(i.length);
//	System.out.println(i[0]);
//	System.out.println(Arrays.toString(i));
for (int j = 0; j < i.length; j++) {
//	System.out.println(i[j]);
	if (i[j]==1) {
		System.out.println("we got number"+"  "+i[j]);
		break;
	}
	else {
		System.out.println(i[j]+"  not matched");
	}
	
}
	}

}
