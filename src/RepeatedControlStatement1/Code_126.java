package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_126 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int even = 0, odd = 0;

		while(true) {
		num = scanner.nextInt();
		
		if (num <= 0) {
			break;
		}
		
		if(num %2 == 0) {
			even++;
		} else {
			odd++;
		}
	}
	System.out.println("odd : " + odd);
	System.out.println("even : " + even);
	}
}
