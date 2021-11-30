package Star;

public class Star4 {

	public static void main(String[] args) {

		int i, j;
		int n = 10;
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(i + j >= n-1) {//9, 
					System.out.printf("%c", '*');
				}else {
					System.out.printf("%c", ' ');
				}
			}
			System.out.println();
		}
	}
}