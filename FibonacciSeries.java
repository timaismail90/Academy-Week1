package introtojava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		// number input
		int n =  scanner.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		
		if(n < 0) {
			System.out.println("number must be positive");
		} else {
			for (int i = 1; i <= n; ++i) {
			      System.out.print(firstTerm + ", ");

			      // compute the next term
			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			    }
			
		}
		scanner.close();

	}

}



