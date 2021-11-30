package Star;

public class Star3 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			for(int y = i; y < 10; y++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
}