package SelectControlStatement;

import java.util.Scanner;

public class Code_533 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sex = sc.next();
		int age = sc.nextInt();

		if (sex.equals("M") && age >= 18) {
			System.out.println("MAN");
		} else if (sex.equals("M") && age < 18) {
			System.out.println("BOY");
		} else if (sex.equals("F") && age >= 18) {
			System.out.println("WOMAN");
		} else if (sex.equals("F") && age < 18) {
			System.out.println("GIRL");
		}else {
			System.out.println("none");
		}
	
	}

}
