package firstprogrampackage;

public class ShortCircuit {

	public static void main(String[] args) {
	int a=12;
	int b=425;
	int c=50;
	int d=94;
	
	if(a>b && a>c && a>d) {
		System.out.println("greater a");
	}
	else if(b>a && b>c && b>d) {
		System.out.println("B is greater");
	}
	else if(c>a && c>b && c>d) {
		System.out.println("c is greater");
	}
	else {
		System.out.println("D is greater");
	}
	int marks=75;
	
	if(marks<=100) {
		if(marks>=40 && marks<=60) {
			System.out.println("Averabge marks obtained");
		}
		else {
			if(marks>=10 && marks<=30) {
				System.out.println("u got failed");
			}
		
			else {
				if(marks==100) {
					System.out.println("got 100");
				}
				else if(marks>=75 && marks<=85) {
					System.out.println("marks between 85 and 75");
				}
			}
			
		
		}
		
	}
	else {
		System.out.println("entered wrong");
	}
	System.out.println("new");
	int i=1;
	while(i<=10) {
		System.out.println(i);
		if(i==9) {
			System.out.println("even");
			break;
		
		
		}
		
		i++;
	}

	}


	
	
}
