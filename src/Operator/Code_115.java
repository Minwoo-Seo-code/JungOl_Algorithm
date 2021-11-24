package Operator;

import java.util.Scanner;

public class Code_115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int minHeight = sc.nextInt();
		int minWeight = sc.nextInt();
		int kiHeight = sc.nextInt();
		int kiWeight = sc.nextInt();

		if (minHeight > kiHeight && kiWeight < minWeight) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
