package java_earthhacker.basicprogramming.inputoutput.basicsofinputoutput.practice;

import java.util.Scanner;

public class RoyAndProfilePicture {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = 0; // minimum length
		int N = 0; // number of photos
		int W, H = 0; // width and height
		String[][] dimensionArr = null;
		Boolean positiveValidations = true;
		try {
			L = sc.nextInt();
			N = sc.nextInt();
			dimensionArr = new String[N][2];
			sc.nextLine();
			for (int i = 0; i < N; i++) {
				dimensionArr[i] = sc.nextLine().split(" ");
				W = Integer.parseInt(dimensionArr[i][0]);
				H = Integer.parseInt(dimensionArr[i][1]);
				if (W < 1 || H < 1 || W > 10000 || H > 10000) {
					positiveValidations = false;
				}
			}
			if (positiveValidations
					&& (L < 1 || N < 1 || L > 10000 || N > 1000)) {
				positiveValidations = false;
			}
			if (positiveValidations) {
				for (String[] imageDimension : dimensionArr) {
					W = Integer.parseInt(imageDimension[0]);
					H = Integer.parseInt(imageDimension[1]);
					if (W < L || H < L) {
						System.out.println("UPLOAD ANOTHER");
					} else if (W == H) {
						System.out.println("ACCEPTED");
					} else {
						System.out.println("CROP IT");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());

		} finally {
			sc.close();
		}
	}
}
