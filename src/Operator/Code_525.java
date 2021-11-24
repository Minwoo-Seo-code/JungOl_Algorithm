package Operator;

import java.util.Scanner;

public class Code_525 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > num2 && num3 < num1) {
			System.out.print("1" + " ");
		} else {
			System.out.print("0" + " ");
		}

		if (num1 == num2 && num3 == num1) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

	}
}
//3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
//(JAVA는 1이면 true, 0이면 false를 출력한다.)
