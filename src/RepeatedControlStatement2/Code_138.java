package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_138 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for(int y = 1; y <= num; y++) {
				System.out.printf("(%d, %d) ", i, y);
			}
			System.out.println();
		}
	}
}