package Assignment;

public class Pattern5_P007 {
	public static void main(String[] args) {
		for (int i = 1; i <= (5 + 1) / 2; i++) {
			for (int s = 1; s <= (3 - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= (5 - 1); i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (3 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

