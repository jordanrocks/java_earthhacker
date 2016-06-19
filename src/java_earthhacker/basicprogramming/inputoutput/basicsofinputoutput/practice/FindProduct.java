package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class FindProduct {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		int[] A = null;
		String NString = null;
		String[] NStrArr = null;
		double answer = 1;
		Long output = 1l;
		int N = 0;
		Double ansconst = (Math.pow(10, 9)) + 7;
		int nconst = new Double((Math.pow(10, 3))).intValue();
		boolean showOutput = true;
		try {
			N = sc.nextInt();
			if (N > 0 && N <= nconst) {
				sc.nextLine();
				NString = sc.nextLine();
				A = new int[N];
				NString = NString.trim();
				NStrArr = NString.split(" ");

				for (int i = 0; i < N; i++) {
					A[i] = Integer.parseInt(NStrArr[i]);
					if (A[i] > 0 && N <= nconst) {
						answer = ((answer * A[i]) % (ansconst));
					} else {
						showOutput = false;
						break;
					}
				}
				if (showOutput) {
					output = Math.round(answer);
					System.out.println(output);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
