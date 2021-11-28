package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_136 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int x = 1; x <= num1; x++) {
			for(int y = 1; y <= num2; y++) {
				System.out.printf("%d ", x*y);
			}
			System.out.println();
		}
		
	}
}
