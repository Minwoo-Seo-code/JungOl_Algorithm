package Debug;

import java.util.*;

public class Code_119 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int a = 0;
		a = cal.get(Calendar.YEAR) - 1900;
		System.out.printf("%d ", a);
		a += cal.get(Calendar.MONTH);
		System.out.printf("%d ", a);
		a += cal.get(Calendar.DATE);
		System.out.printf("%d\n", a);
	}
}