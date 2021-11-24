package Debug;

import java.util.Scanner;

public class Code_526 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		int result1=(int)(num1*num2);
		System.out.print(result1+" ");
		
		
		num1 = (int)num1;
		num2 = (int)num2;
		
		System.out.println((int)(num1*num2));
		
		
		
	}

}
