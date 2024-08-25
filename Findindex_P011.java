package Assignment;

import java.util.Scanner;

public class Findindex_P011 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to find: ");
        int element = sc.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

	}

}
