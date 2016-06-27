package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class LifetheUniverseandEverything {
	public static void main(String... strings){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			while(sc.hasNext()){
				n = sc.nextInt();
				if(n == 42)
					break;
				else
					System.out.println(n);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
		
	}	
}
