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
//3���� ������ �Է� �޾� ù ��° ���� ���� ũ�� 1 �ƴϸ� 0�� ����ϰ� �� ���� ���� ��� ������ 1 �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
