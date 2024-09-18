package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("n=");
		int n = in.nextInt();
		int[] values = new int[n-1];
		for (int a = 0; a < values.length ; a++) {
			values[a] = a+2;
		}
		
		
		for (int a = 2; a <= n; a++) {
			for (int b = 2; a*b <= n; b++) {
				values[a*b-2] = 0;
			}
		}
		
		for (int print : values) {
			if (print != 0) {
				System.out.println(print);
			}
		}
		

	}

}
