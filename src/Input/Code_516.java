package Input;

import java.util.Scanner;

public class Code_516 {

	public static void main(String[] args) {

		float num1;
		float num2;
		String str;
		
		Scanner scanner = new Scanner(System.in);
		
		num1 = scanner.nextFloat();
		num2 = scanner.nextFloat();
		str = scanner.next();
		
		System.out.printf("%.2f%n",num1);
		System.out.printf("%.2f%n",num2);
		System.out.printf("%s",str);
		
	}

}
