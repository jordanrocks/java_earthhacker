package java_earthhacker.basicprogramming.bitmanipulation.basicsofbitmanipulation.practice;

import java.util.Scanner;

public class SubsetXOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = 0;
		int setCount[] = null;
		String[] s = null;

		try {
			cases = sc.nextInt();
			setCount = new int[cases];
			s = new String[cases];
			for (int i = 0; i < cases; i++) {
				setCount[i] = sc.nextInt();
				sc.nextLine();
				s[i] = sc.nextLine();
			}
			for (int i = 0; i < cases; i++) {
				if (setCount[i] > 1)
					System.out.println(0);
				else
					System.out.println(s[i].split(" ")[0]);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}

	}

}
