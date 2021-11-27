package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_133 {

	public static void main(String[] args) {

		int countNum = 0;
		int sum = 0;
		float avg = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		countNum = sc.nextInt();
		for (int i = 0; i < countNum; i++) {
			num = sc.nextInt();
			sum += num;
		}
		
		avg = (float)sum/countNum;
		System.out.printf("%.2f", avg);
	}
}
