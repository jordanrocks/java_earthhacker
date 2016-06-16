package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.tutorial;

import java.util.Scanner;

public class Tutorial1 {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		try {
			int N = 0;
			String S = null;

			N = in.nextInt();
			S = in.next();
			if (N < 10) 
				System.out.println(N * 2);
			System.out.println(S);
		} catch (Exception e){
			
		} finally {
			in.close();
		}
	}
}
