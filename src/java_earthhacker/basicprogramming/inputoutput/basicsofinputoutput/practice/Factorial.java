package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1;
		int O = 1;
		try {
			N = sc.nextInt();
			if (N > 0 && N <= 10) {
				for (int i = N; i >= 1; i--) {
					O = O * i;
				}
				System.out.println(O);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}

}
