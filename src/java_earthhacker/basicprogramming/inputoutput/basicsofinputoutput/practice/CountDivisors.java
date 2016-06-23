package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class CountDivisors {

	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		int l = 0, r = 0, k = 0;
		String[] inputStringArray = null;
		int[] inputIntArray = new int[3];
		int productCount = 0;
		try {
			inputStringArray = sc.nextLine().split(" ");
			for (int i = 0; i < inputStringArray.length; i++) {
				inputIntArray[i] = Integer.parseInt(inputStringArray[i]);
			}
			l = inputIntArray[0];
			r = inputIntArray[1];
			k = inputIntArray[2];
			if (l <= r && 1 <= l && r <= 1000 && 1 <= k && k <= 1000) {
				for (int j = l; j <= r; j++) {
					if ((j % k) == 0) {
						productCount++;
					}
				}
				System.out.println(productCount);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
