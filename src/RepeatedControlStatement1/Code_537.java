package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_537 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int sum = 0;

		int i = 1;
		while (i <= input) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
