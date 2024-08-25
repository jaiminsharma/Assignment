package Assignment;

public class SecondLargest_P024 {
	public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6};

        if (array.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("The second largest element is: " + second);
        }
    }


}
