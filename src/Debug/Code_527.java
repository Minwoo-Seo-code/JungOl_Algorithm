package Debug;

import java.util.Scanner;

public class Code_527 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d ", num1/num2);
		
		double num3 = num1;
		System.out.printf("%.2f",num3/num2);
	}

}
