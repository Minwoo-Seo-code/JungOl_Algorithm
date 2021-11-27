package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_134 {

	public static void main(String[] args) {

		int num = 0;
		int odd = 0;
		int even = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			
			if (num %2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}
