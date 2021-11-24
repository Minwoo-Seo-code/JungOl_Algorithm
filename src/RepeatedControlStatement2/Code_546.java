package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_546 {
	public static void main(String[] args) {
		
		int Subnum;
		int scores = 0;
		
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Subnum = scanner.nextInt();
		
		for(int i = 1; i <= Subnum; i++) {
			scores += scanner.nextInt();
		}
		avg = (double)scores / Subnum;
		System.out.printf("avg : %.1f%n", avg);
		
		if(avg >= 80) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		
	}
}
