package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_545 {
	public static void main(String[] args) {
	
		int num, i;
		int three =0;  
		int five = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(i = 1; i <=10; i++) {
			num = scanner.nextInt();
			if(num %3 == 0) {
				three++;
			}
			if(num %5 == 0) {
				five++;
			}
		}
		
		System.out.println("Multiples of 3 : " + three);
		System.out.println("Multiples of 5 : " + five);
		
		
		
		
		
		
		
	}	
}
