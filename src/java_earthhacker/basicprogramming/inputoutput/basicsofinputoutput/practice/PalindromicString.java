package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class PalindromicString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		try {
			s = sc.next();
			int sLen = s.length();
			String palindromicFlag = "YES";
			if (sLen <= 100 && s.matches("\\p{javaLowerCase}+")) {
				int sHalfLen = sLen / 2;
				for (int i = 0; i < sHalfLen; i++) {
					if (s.charAt(i) != s.charAt(sLen - (i + 1))) {
						palindromicFlag = "NO";
						 break;
					}
				}
			} else {
				palindromicFlag = "NO";
			}
			System.out.println(palindromicFlag);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
