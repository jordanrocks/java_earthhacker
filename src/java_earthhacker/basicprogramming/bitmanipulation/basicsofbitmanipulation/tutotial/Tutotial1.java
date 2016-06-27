package java_earthhacker.basicprogramming.bitmanipulation.basicsofbitmanipulation.tutotial;

import java.util.Scanner;

public class Tutotial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int[] n = null;
		String bitStr = null;
		int count = 0;
		boolean constraintCheck = true;
		try {
			T = sc.nextInt();
			if (T > 0 || T <= 1000) {
				n = new int[T];
				for (int i = 1; i <= T; i++) {
					n[i - 1] = sc.nextInt();
					if (constraintCheck && (n[i - 1] < 1 || n[i - 1] > 1000))
						constraintCheck = false;
				}
				for (int data : n) {
					bitStr = Integer.toBinaryString(data);
					for (char bit : bitStr.toCharArray()) {
						if (bit == '1')
							count++;
					}
					System.out.println(count);
					count = 0;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
