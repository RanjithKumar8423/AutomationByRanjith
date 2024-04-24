package whileloop;

import java.util.Scanner;

public class WhileLoopFactorial {

	public static void main(String[] args) {
	int fact=1;
	int i=1;
	System.out.println("please enter number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
   while (i<=num) {
	   fact=fact*i;
	   i++;
	
}
   System.out.println("factorial  "+num+"   is   " +fact);
	}

}
