package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_544 {
	public static void main(String[] args) {
		
		int num, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		
		for(int i = num; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
