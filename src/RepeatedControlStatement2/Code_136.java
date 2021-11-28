package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_136 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d ", num*i);
		}
	}
}
