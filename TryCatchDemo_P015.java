package Assignment;
	
public class TryCatchDemo_P015 {

	public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero.");
        }

	}

}
