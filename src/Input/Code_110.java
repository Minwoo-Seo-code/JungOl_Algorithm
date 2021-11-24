package Input;

import java.util.Scanner;

public class Code_110 {

	public static void main(String[] args) {

		System.out.printf("yard? ");
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.printf("%.1fyard = %.1fcm", num, 91.44f*num);
	}

}
