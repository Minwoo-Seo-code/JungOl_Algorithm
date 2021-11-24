package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i > j) {
			for(int k = j; k<=i; k++) {
				System.out.print(k + " ");
			}
			
			}else {
				for(int k = i; k<=j; k++) {
					System.out.print(k + " ");
				}
		}
		
		
	}

}
