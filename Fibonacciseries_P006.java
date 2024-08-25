package Assignment;

import java.util.Scanner;

public class Fibonacciseries_P006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		int terms = sc.nextInt();
		
		int n1=2,n2=4,n3;
		
		System.out.println(n1+
				n2);
		
		for(int i = 2;i<terms;++i) {
			n3= n1 + n2;
			
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
					
		}
		
	}

}
