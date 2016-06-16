package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class ToggleString {
	public static void main (String... g){
		String S = null;
		Scanner in = new Scanner(System.in);
		try{
			S = in.next();
			int sLength = S.length();
			Character currentChar = null; 
			StringBuffer updatedString = new StringBuffer();
			if(sLength <= 100){
				for(int i = 0; i < sLength; i++){
					currentChar = S.charAt(i);
					
					if(Character.isLowerCase(currentChar))
						updatedString.append(Character.toUpperCase(currentChar));
					else
						updatedString.append(Character.toLowerCase(currentChar));
				}
			}
			S = updatedString.toString();
			System.out.println(S);
		} catch (Exception e){
			System.out.println(e.getStackTrace());
		} finally {
			in.close();
		}
		
	}
}
