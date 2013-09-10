import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		exercise3(2);
	}
	public static void letterXToTheN(int x, int n) {
		int total=x;
		while (n >= 1) {
			System.out.println(total);
			total = total*x;
			n--;
		}
	}
	public static void numberFact(int n) {
		int total = n;
		// while (n >= 2) {
		// 	System.out.println(n);
		// 	n--;
		// 	total = total*(n);

		// }
		// System.out.println(total);
		for (int i=n; n>=2;n-- ) {
			System.out.println(n);
			total = total*(n-1);
		}
		System.out.println(total);
	}
	public static void exercise3(int x) {
		int n = 1;
		double sum = 1.0;
		long nFact = n;
		double term = Math.pow(x,n)/nFact;
		while (term > (Math.pow(10.0, -12.0))) {
			term = Math.pow(x,n)/nFact;
			sum = sum + term;
			System.out.println("n:" + n + " term:" + term + " sum:" + sum);
			n++;
			nFact *= n;
		}

		System.out.println("My e^x: " + sum);
		System.out.println("Real e^x: " + Math.exp(x));
	}
	public static void sum(int n) {

		int total = 0;
		while (n >= 1) {
			System.out.println(n);
			total = total + n;
			n = n-1;


		}
		System.out.println(total);
	}
	
	
}