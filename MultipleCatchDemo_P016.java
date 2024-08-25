package Assignment;

public class MultipleCatchDemo_P016 {
	public static void main(String[] args) {
		
	
    try {
        int data = 200 / 0;
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Division by zero.");
    } catch (Exception e) {
        System.out.println("Exception: Something went wrong.");
    }
	}
}
