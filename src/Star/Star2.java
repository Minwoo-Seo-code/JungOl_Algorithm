package Star;

public class Star2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int y = 0; y < i+1; y++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
}
