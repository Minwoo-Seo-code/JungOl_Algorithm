package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_547 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 2; i <=6; i++) {
			for(int j = i; j <=i+4; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}
}
