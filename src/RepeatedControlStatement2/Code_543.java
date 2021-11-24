package RepeatedControlStatement2;

import java.util.Scanner;

public class Code_543 {
 public static void main(String[] args) {    
     int num, i;
     Scanner sc = new Scanner(System.in);
     num = sc.nextInt();
     
     for(i = 1; i<=num; i++) {
    	 if(i %2 == 0) {
    		 System.out.print(i + " ");
    	 }
     }
 }
 
}