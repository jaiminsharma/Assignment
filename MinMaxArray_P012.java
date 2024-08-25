package Assignment;

public class MinMaxArray_P012 {

	public static void main(String[] args) {
        int[] array = {9, 2, 3, 12, 10};
        int max = array[0];
        int min = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Maximum value in array is: " + max);
        System.out.println("Minimum value in array is: " + min);


	}

}
